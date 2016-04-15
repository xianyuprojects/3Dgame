package com.edu.dmgame.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.edu.dmgame.entities.ChapterEntity;
import com.edu.dmgame.entities.ChapterCommentEntity;
import com.edu.dmgame.entities.GameContentEntity;
import com.edu.dmgame.entities.CategoryEntity;

import com.edu.dmgame.dao.ChapterEntityDao;
import com.edu.dmgame.dao.ChapterCommentEntityDao;
import com.edu.dmgame.dao.GameContentEntityDao;
import com.edu.dmgame.dao.CategoryEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig chapterEntityDaoConfig;
    private final DaoConfig chapterCommentEntityDaoConfig;
    private final DaoConfig gameContentEntityDaoConfig;
    private final DaoConfig categoryEntityDaoConfig;

    private final ChapterEntityDao chapterEntityDao;
    private final ChapterCommentEntityDao chapterCommentEntityDao;
    private final GameContentEntityDao gameContentEntityDao;
    private final CategoryEntityDao categoryEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        chapterEntityDaoConfig = daoConfigMap.get(ChapterEntityDao.class).clone();
        chapterEntityDaoConfig.initIdentityScope(type);

        chapterCommentEntityDaoConfig = daoConfigMap.get(ChapterCommentEntityDao.class).clone();
        chapterCommentEntityDaoConfig.initIdentityScope(type);

        gameContentEntityDaoConfig = daoConfigMap.get(GameContentEntityDao.class).clone();
        gameContentEntityDaoConfig.initIdentityScope(type);

        categoryEntityDaoConfig = daoConfigMap.get(CategoryEntityDao.class).clone();
        categoryEntityDaoConfig.initIdentityScope(type);

        chapterEntityDao = new ChapterEntityDao(chapterEntityDaoConfig, this);
        chapterCommentEntityDao = new ChapterCommentEntityDao(chapterCommentEntityDaoConfig, this);
        gameContentEntityDao = new GameContentEntityDao(gameContentEntityDaoConfig, this);
        categoryEntityDao = new CategoryEntityDao(categoryEntityDaoConfig, this);

        registerDao(ChapterEntity.class, chapterEntityDao);
        registerDao(ChapterCommentEntity.class, chapterCommentEntityDao);
        registerDao(GameContentEntity.class, gameContentEntityDao);
        registerDao(CategoryEntity.class, categoryEntityDao);
    }
    
    public void clear() {
        chapterEntityDaoConfig.getIdentityScope().clear();
        chapterCommentEntityDaoConfig.getIdentityScope().clear();
        gameContentEntityDaoConfig.getIdentityScope().clear();
        categoryEntityDaoConfig.getIdentityScope().clear();
    }

    public ChapterEntityDao getChapterEntityDao() {
        return chapterEntityDao;
    }

    public ChapterCommentEntityDao getChapterCommentEntityDao() {
        return chapterCommentEntityDao;
    }

    public GameContentEntityDao getGameContentEntityDao() {
        return gameContentEntityDao;
    }

    public CategoryEntityDao getCategoryEntityDao() {
        return categoryEntityDao;
    }

}
