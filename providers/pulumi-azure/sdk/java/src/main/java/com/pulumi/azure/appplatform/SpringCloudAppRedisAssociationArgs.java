// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudAppRedisAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudAppRedisAssociationArgs Empty = new SpringCloudAppRedisAssociationArgs();

    /**
     * Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the Redis Cache access key.
     * 
     */
    @Import(name="redisAccessKey", required=true)
    private Output<String> redisAccessKey;

    /**
     * @return Specifies the Redis Cache access key.
     * 
     */
    public Output<String> redisAccessKey() {
        return this.redisAccessKey;
    }

    /**
     * Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="redisCacheId", required=true)
    private Output<String> redisCacheId;

    /**
     * @return Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> redisCacheId() {
        return this.redisCacheId;
    }

    /**
     * Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="springCloudAppId", required=true)
    private Output<String> springCloudAppId;

    /**
     * @return Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> springCloudAppId() {
        return this.springCloudAppId;
    }

    /**
     * Should SSL be used when connecting to Redis? Defaults to `true`.
     * 
     */
    @Import(name="sslEnabled")
    private @Nullable Output<Boolean> sslEnabled;

    /**
     * @return Should SSL be used when connecting to Redis? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> sslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }

    private SpringCloudAppRedisAssociationArgs() {}

    private SpringCloudAppRedisAssociationArgs(SpringCloudAppRedisAssociationArgs $) {
        this.name = $.name;
        this.redisAccessKey = $.redisAccessKey;
        this.redisCacheId = $.redisCacheId;
        this.springCloudAppId = $.springCloudAppId;
        this.sslEnabled = $.sslEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudAppRedisAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudAppRedisAssociationArgs $;

        public Builder() {
            $ = new SpringCloudAppRedisAssociationArgs();
        }

        public Builder(SpringCloudAppRedisAssociationArgs defaults) {
            $ = new SpringCloudAppRedisAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redisAccessKey Specifies the Redis Cache access key.
         * 
         * @return builder
         * 
         */
        public Builder redisAccessKey(Output<String> redisAccessKey) {
            $.redisAccessKey = redisAccessKey;
            return this;
        }

        /**
         * @param redisAccessKey Specifies the Redis Cache access key.
         * 
         * @return builder
         * 
         */
        public Builder redisAccessKey(String redisAccessKey) {
            return redisAccessKey(Output.of(redisAccessKey));
        }

        /**
         * @param redisCacheId Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(Output<String> redisCacheId) {
            $.redisCacheId = redisCacheId;
            return this;
        }

        /**
         * @param redisCacheId Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(String redisCacheId) {
            return redisCacheId(Output.of(redisCacheId));
        }

        /**
         * @param springCloudAppId Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAppId(Output<String> springCloudAppId) {
            $.springCloudAppId = springCloudAppId;
            return this;
        }

        /**
         * @param springCloudAppId Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAppId(String springCloudAppId) {
            return springCloudAppId(Output.of(springCloudAppId));
        }

        /**
         * @param sslEnabled Should SSL be used when connecting to Redis? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder sslEnabled(@Nullable Output<Boolean> sslEnabled) {
            $.sslEnabled = sslEnabled;
            return this;
        }

        /**
         * @param sslEnabled Should SSL be used when connecting to Redis? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder sslEnabled(Boolean sslEnabled) {
            return sslEnabled(Output.of(sslEnabled));
        }

        public SpringCloudAppRedisAssociationArgs build() {
            $.redisAccessKey = Objects.requireNonNull($.redisAccessKey, "expected parameter 'redisAccessKey' to be non-null");
            $.redisCacheId = Objects.requireNonNull($.redisCacheId, "expected parameter 'redisCacheId' to be non-null");
            $.springCloudAppId = Objects.requireNonNull($.springCloudAppId, "expected parameter 'springCloudAppId' to be non-null");
            return $;
        }
    }

}
