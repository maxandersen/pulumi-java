// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebasehosting_v1beta1.outputs.ReleaseResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetChannelResult {
    /**
     * The time at which the channel was created.
     * 
     */
    private final String createTime;
    /**
     * The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it's set directly or via the `ttl` field.
     * 
     */
    private final String expireTime;
    /**
     * Text labels used for extra metadata and/or filtering.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
     */
    private final String name;
    /**
     * The current release for the channel, if any.
     * 
     */
    private final ReleaseResponse release;
    /**
     * The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    private final Integer retainedReleaseCount;
    /**
     * Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
     */
    private final String ttl;
    /**
     * The time at which the channel was last updated.
     * 
     */
    private final String updateTime;
    /**
     * The URL at which the content of this channel's current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel's current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel's current release can also be viewed at any connected custom domains.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetChannelResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("release") ReleaseResponse release,
        @CustomType.Parameter("retainedReleaseCount") Integer retainedReleaseCount,
        @CustomType.Parameter("ttl") String ttl,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("url") String url) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.labels = labels;
        this.name = name;
        this.release = release;
        this.retainedReleaseCount = retainedReleaseCount;
        this.ttl = ttl;
        this.updateTime = updateTime;
        this.url = url;
    }

    /**
     * The time at which the channel was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it's set directly or via the `ttl` field.
     * 
    */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * Text labels used for extra metadata and/or filtering.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The current release for the channel, if any.
     * 
    */
    public ReleaseResponse release() {
        return this.release;
    }
    /**
     * The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
    */
    public Integer retainedReleaseCount() {
        return this.retainedReleaseCount;
    }
    /**
     * Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
    */
    public String ttl() {
        return this.ttl;
    }
    /**
     * The time at which the channel was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * The URL at which the content of this channel's current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel's current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel's current release can also be viewed at any connected custom domains.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private ReleaseResponse release;
        private Integer retainedReleaseCount;
        private String ttl;
        private String updateTime;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.release = defaults.release;
    	      this.retainedReleaseCount = defaults.retainedReleaseCount;
    	      this.ttl = defaults.ttl;
    	      this.updateTime = defaults.updateTime;
    	      this.url = defaults.url;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder release(ReleaseResponse release) {
            this.release = Objects.requireNonNull(release);
            return this;
        }
        public Builder retainedReleaseCount(Integer retainedReleaseCount) {
            this.retainedReleaseCount = Objects.requireNonNull(retainedReleaseCount);
            return this;
        }
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetChannelResult build() {
            return new GetChannelResult(createTime, expireTime, labels, name, release, retainedReleaseCount, ttl, updateTime, url);
        }
    }
}
