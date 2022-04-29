// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountSessionArgs extends ResourceArgs {

    public static final IntegrationAccountSessionArgs Empty = new IntegrationAccountSessionArgs();

    /**
     * The session content.
     * 
     */
    @Import(name="content")
    private @Nullable Output<Object> content;

    /**
     * @return The session content.
     * 
     */
    public Optional<Output<Object>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private Output<String> integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The integration account session name.
     * 
     */
    @Import(name="sessionName")
    private @Nullable Output<String> sessionName;

    /**
     * @return The integration account session name.
     * 
     */
    public Optional<Output<String>> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IntegrationAccountSessionArgs() {}

    private IntegrationAccountSessionArgs(IntegrationAccountSessionArgs $) {
        this.content = $.content;
        this.integrationAccountName = $.integrationAccountName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sessionName = $.sessionName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountSessionArgs $;

        public Builder() {
            $ = new IntegrationAccountSessionArgs();
        }

        public Builder(IntegrationAccountSessionArgs defaults) {
            $ = new IntegrationAccountSessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The session content.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<Object> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The session content.
         * 
         * @return builder
         * 
         */
        public Builder content(Object content) {
            return content(Output.of(content));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sessionName The integration account session name.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(@Nullable Output<String> sessionName) {
            $.sessionName = sessionName;
            return this;
        }

        /**
         * @param sessionName The integration account session name.
         * 
         * @return builder
         * 
         */
        public Builder sessionName(String sessionName) {
            return sessionName(Output.of(sessionName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public IntegrationAccountSessionArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
