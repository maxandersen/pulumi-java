// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsumerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumerGroupArgs Empty = new ConsumerGroupArgs();

    /**
     * The consumer group name
     * 
     */
    @Import(name="consumerGroupName")
    private @Nullable Output<String> consumerGroupName;

    public Optional<Output<String>> consumerGroupName() {
        return Optional.ofNullable(this.consumerGroupName);
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
    private Output<String> eventHubName;

    public Output<String> eventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * User Metadata is a placeholder to store user-defined string data with maximum length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information also user-defined configuration settings can be stored.
     * 
     */
    @Import(name="userMetadata")
    private @Nullable Output<String> userMetadata;

    public Optional<Output<String>> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    private ConsumerGroupArgs() {}

    private ConsumerGroupArgs(ConsumerGroupArgs $) {
        this.consumerGroupName = $.consumerGroupName;
        this.eventHubName = $.eventHubName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.userMetadata = $.userMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsumerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsumerGroupArgs $;

        public Builder() {
            $ = new ConsumerGroupArgs();
        }

        public Builder(ConsumerGroupArgs defaults) {
            $ = new ConsumerGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder consumerGroupName(@Nullable Output<String> consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder consumerGroupName(String consumerGroupName) {
            return consumerGroupName(Output.of(consumerGroupName));
        }

        public Builder eventHubName(Output<String> eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        public Builder eventHubName(String eventHubName) {
            return eventHubName(Output.of(eventHubName));
        }

        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            $.userMetadata = userMetadata;
            return this;
        }

        public Builder userMetadata(String userMetadata) {
            return userMetadata(Output.of(userMetadata));
        }

        public ConsumerGroupArgs build() {
            $.eventHubName = Objects.requireNonNull($.eventHubName, "expected parameter 'eventHubName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
