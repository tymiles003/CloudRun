package com.alkisum.android.cloudrun.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Transient;

@Entity
public class Session {

    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private long start;

    private Long end;

    private Long duration;

    private Float distance;

    @Transient
    private boolean selected;

    @ToMany(referencedJoinProperty = "sessionId")
    private List<DataPoint> dataPoints;

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1243220280)
    public synchronized void resetDataPoints() {
        dataPoints = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1358677256)
    public List<DataPoint> getDataPoints() {
        if (dataPoints == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DataPointDao targetDao = daoSession.getDataPointDao();
            List<DataPoint> dataPointsNew = targetDao._querySession_DataPoints(id);
            synchronized (this) {
                if(dataPoints == null) {
                    dataPoints = dataPointsNew;
                }
            }
        }
        return dataPoints;
    }

    /** Used for active entity operations. */
    @Generated(hash = 1616835709)
    private transient SessionDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public Float getDistance() {
        return this.distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Long getEnd() {
        return this.end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public long getStart() {
        return this.start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getSelected() {
        return this.selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1458438772)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSessionDao() : null;
    }

    @Generated(hash = 1103544323)
    public Session(Long id, long start, Long end, Long duration, Float distance) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.distance = distance;
    }

    @Generated(hash = 1317889643)
    public Session() {
    }
}
