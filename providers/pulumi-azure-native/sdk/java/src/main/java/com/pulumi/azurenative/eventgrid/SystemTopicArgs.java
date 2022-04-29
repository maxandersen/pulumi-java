// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.inputs.IdentityInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemTopicArgs extends ResourceArgs {

    public static final SystemTopicArgs Empty = new SystemTopicArgs();

    /**
     * Identity information for the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityInfoArgs> identity;

    /**
     * @return Identity information for the resource.
     * 
     */
    public Optional<Output<IdentityInfoArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Source for the system topic.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Source for the system topic.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName")
    private @Nullable Output<String> systemTopicName;

    /**
     * @return Name of the system topic.
     * 
     */
    public Optional<Output<String>> systemTopicName() {
        return Optional.ofNullable(this.systemTopicName);
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * TopicType for the system topic.
     * 
     */
    @Import(name="topicType")
    private @Nullable Output<String> topicType;

    /**
     * @return TopicType for the system topic.
     * 
     */
    public Optional<Output<String>> topicType() {
        return Optional.ofNullable(this.topicType);
    }

    private SystemTopicArgs() {}

    private SystemTopicArgs(SystemTopicArgs $) {
        this.identity = $.identity;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.source = $.source;
        this.systemTopicName = $.systemTopicName;
        this.tags = $.tags;
        this.topicType = $.topicType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemTopicArgs $;

        public Builder() {
            $ = new SystemTopicArgs();
        }

        public Builder(SystemTopicArgs defaults) {
            $ = new SystemTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity Identity information for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<IdentityInfoArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Identity information for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(IdentityInfoArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param source Source for the system topic.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Source for the system topic.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(@Nullable Output<String> systemTopicName) {
            $.systemTopicName = systemTopicName;
            return this;
        }

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(String systemTopicName) {
            return systemTopicName(Output.of(systemTopicName));
        }

        /**
         * @param tags Tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param topicType TopicType for the system topic.
         * 
         * @return builder
         * 
         */
        public Builder topicType(@Nullable Output<String> topicType) {
            $.topicType = topicType;
            return this;
        }

        /**
         * @param topicType TopicType for the system topic.
         * 
         * @return builder
         * 
         */
        public Builder topicType(String topicType) {
            return topicType(Output.of(topicType));
        }

        public SystemTopicArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
