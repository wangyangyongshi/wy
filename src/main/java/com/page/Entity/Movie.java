package com.page.Entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author 王二小
 * @date 2019/3/28 0:03
 */
@Alias("Movie")
public class Movie {
    /**
     * ID
     */
    private Integer id;

    /**
     * 父id，主要针对电视剧
     */
    private Integer parentId;

    /**
     * 标题
     */
    private String title;

    /**
     * 英文名
     */
    private String englishName;

    /**
     * 封面图片
     */
    private String coverPic;

    /**
     * 导演
     */
    private String director;

    /**
     * 主演
     */
    private String mainActor;

    /**
     * 别名
     */
    private String alias;

    /**
     * 年份
     */
    private String year;

    /**
     * 上映日期
     */
    private Date releaseDate;

    /**
     * 评分
     */
    private Float score;

    /**
     * 原始播放地址
     */
    private String originalUrl;

    /**
     * 平台播放url
     */

    private String videoUrl;

    /**
     * 视频类型[1：电影2：电视剧]
     */
    private Integer type;

    /**
     * 最新[0：否1：是]
     */

    private Boolean isNewest;

    /**
     * 最热[0：否1：是]
     */
    private Boolean isHot;

    /**
     * 排序
     */
    private Integer orderSort;

    /**
     * 平台类型[1：爱奇艺；2：腾讯视频]
     */
    private Integer platform;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 介绍
     */
    private String introduce;

    private String releaseDate2;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取父id，主要针对电视剧
     *
     * @return parent_id - 父id，主要针对电视剧
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父id，主要针对电视剧
     *
     * @param parentId 父id，主要针对电视剧
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取英文名
     *
     * @return english_name - 英文名
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置英文名
     *
     * @param englishName 英文名
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * 获取封面图片
     *
     * @return cover_pic - 封面图片
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * 设置封面图片
     *
     * @param coverPic 封面图片
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * 获取导演
     *
     * @return director - 导演
     */
    public String getDirector() {
        return director;
    }

    /**
     * 设置导演
     *
     * @param director 导演
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 获取主演
     *
     * @return main_actor - 主演
     */
    public String getMainActor() {
        return mainActor;
    }

    /**
     * 设置主演
     *
     * @param mainActor 主演
     */
    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    /**
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取上映日期
     *
     * @return release_date - 上映日期
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置上映日期
     *
     * @param releaseDate 上映日期
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 获取评分
     *
     * @return score - 评分
     */
    public Float getScore() {
        return score;
    }

    /**
     * 设置评分
     *
     * @param score 评分
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * 获取原始播放地址
     *
     * @return original_url - 原始播放地址
     */
    public String getOriginalUrl() {
        return originalUrl;
    }

    /**
     * 设置原始播放地址
     *
     * @param originalUrl 原始播放地址
     */
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    /**
     * 获取平台播放url
     *
     * @return video_url - 平台播放url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置平台播放url
     *
     * @param videoUrl 平台播放url
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取视频类型[1：电影2：电视剧]
     *
     * @return type - 视频类型[1：电影2：电视剧]
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置视频类型[1：电影2：电视剧]
     *
     * @param type 视频类型[1：电影2：电视剧]
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取最新[0：否1：是]
     *
     * @return is_newest - 最新[0：否1：是]
     */
    public Boolean getIsNewest() {
        return isNewest;
    }

    /**
     * 设置最新[0：否1：是]
     *
     * @param isNewest 最新[0：否1：是]
     */
    public void setIsNewest(Boolean isNewest) {
        this.isNewest = isNewest;
    }

    /**
     * 获取最热[0：否1：是]
     *
     * @return is_hot - 最热[0：否1：是]
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * 设置最热[0：否1：是]
     *
     * @param isHot 最热[0：否1：是]
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取排序
     *
     * @return order_sort - 排序
     */
    public Integer getOrderSort() {
        return orderSort;
    }

    /**
     * 设置排序
     *
     * @param orderSort 排序
     */
    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    /**
     * 获取平台类型[1：爱奇艺；2：腾讯视频]
     *
     * @return platform - 平台类型[1：爱奇艺；2：腾讯视频]
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置平台类型[1：爱奇艺；2：腾讯视频]
     *
     * @param platform 平台类型[1：爱奇艺；2：腾讯视频]
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取介绍
     *
     * @return introduce - 介绍
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置介绍
     *
     * @param introduce 介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getReleaseDate2() {
        return releaseDate2;
    }

    public void setReleaseDate2(String releaseDate2) {
        this.releaseDate2 = releaseDate2;
    }

}
