// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement;

import com.pulumi.azurenative.operationsmanagement.inputs.SolutionPlanArgs;
import com.pulumi.azurenative.operationsmanagement.inputs.SolutionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SolutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SolutionArgs Empty = new SolutionArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Plan for solution object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<SolutionPlanArgs> plan;

    /**
     * @return Plan for solution object supported by the OperationsManagement resource provider.
     * 
     */
    public Optional<Output<SolutionPlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Properties for solution object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<SolutionPropertiesArgs> properties;

    /**
     * @return Properties for solution object supported by the OperationsManagement resource provider.
     * 
     */
    public Optional<Output<SolutionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to get. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * User Solution Name.
     * 
     */
    @Import(name="solutionName")
    private @Nullable Output<String> solutionName;

    /**
     * @return User Solution Name.
     * 
     */
    public Optional<Output<String>> solutionName() {
        return Optional.ofNullable(this.solutionName);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SolutionArgs() {}

    private SolutionArgs(SolutionArgs $) {
        this.location = $.location;
        this.plan = $.plan;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.solutionName = $.solutionName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SolutionArgs $;

        public Builder() {
            $ = new SolutionArgs();
        }

        public Builder(SolutionArgs defaults) {
            $ = new SolutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param plan Plan for solution object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<SolutionPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Plan for solution object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder plan(SolutionPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param properties Properties for solution object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<SolutionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties for solution object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(SolutionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param solutionName User Solution Name.
         * 
         * @return builder
         * 
         */
        public Builder solutionName(@Nullable Output<String> solutionName) {
            $.solutionName = solutionName;
            return this;
        }

        /**
         * @param solutionName User Solution Name.
         * 
         * @return builder
         * 
         */
        public Builder solutionName(String solutionName) {
            return solutionName(Output.of(solutionName));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SolutionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
