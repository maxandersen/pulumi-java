// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managedapplication;

import com.pulumi.azure.managedapplication.inputs.ApplicationPlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The application definition ID to deploy.
     * 
     */
    @Import(name="applicationDefinitionId")
    private @Nullable Output<String> applicationDefinitionId;

    /**
     * @return The application definition ID to deploy.
     * 
     */
    public Optional<Output<String>> applicationDefinitionId() {
        return Optional.ofNullable(this.applicationDefinitionId);
    }

    /**
     * The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedResourceGroupName", required=true)
    private Output<String> managedResourceGroupName;

    /**
     * @return The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managedResourceGroupName() {
        return this.managedResourceGroupName;
    }

    /**
     * Specifies the name of the Managed Application. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Managed Application. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
     * 
     */
    @Import(name="parameterValues")
    private @Nullable Output<String> parameterValues;

    /**
     * @return The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
     * 
     */
    public Optional<Output<String>> parameterValues() {
        return Optional.ofNullable(this.parameterValues);
    }

    /**
     * A mapping of name and value pairs to pass to the managed application as parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A mapping of name and value pairs to pass to the managed application as parameters.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * One `plan` block as defined below.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<ApplicationPlanArgs> plan;

    /**
     * @return One `plan` block as defined below.
     * 
     */
    public Optional<Output<ApplicationPlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.applicationDefinitionId = $.applicationDefinitionId;
        this.kind = $.kind;
        this.location = $.location;
        this.managedResourceGroupName = $.managedResourceGroupName;
        this.name = $.name;
        this.parameterValues = $.parameterValues;
        this.parameters = $.parameters;
        this.plan = $.plan;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationDefinitionId The application definition ID to deploy.
         * 
         * @return builder
         * 
         */
        public Builder applicationDefinitionId(@Nullable Output<String> applicationDefinitionId) {
            $.applicationDefinitionId = applicationDefinitionId;
            return this;
        }

        /**
         * @param applicationDefinitionId The application definition ID to deploy.
         * 
         * @return builder
         * 
         */
        public Builder applicationDefinitionId(String applicationDefinitionId) {
            return applicationDefinitionId(Output.of(applicationDefinitionId));
        }

        /**
         * @param kind The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the managed application to deploy. Possible values are `MarketPlace` and `ServiceCatalog`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedResourceGroupName The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(Output<String> managedResourceGroupName) {
            $.managedResourceGroupName = managedResourceGroupName;
            return this;
        }

        /**
         * @param managedResourceGroupName The name of the target resource group where all the resources deployed by the managed application will reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(String managedResourceGroupName) {
            return managedResourceGroupName(Output.of(managedResourceGroupName));
        }

        /**
         * @param name Specifies the name of the Managed Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Managed Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameterValues The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
         * 
         * @return builder
         * 
         */
        public Builder parameterValues(@Nullable Output<String> parameterValues) {
            $.parameterValues = parameterValues;
            return this;
        }

        /**
         * @param parameterValues The parameter values to pass to the Managed Application. This field is a JSON object that allows you to assign parameters to this Managed Application.
         * 
         * @return builder
         * 
         */
        public Builder parameterValues(String parameterValues) {
            return parameterValues(Output.of(parameterValues));
        }

        /**
         * @param parameters A mapping of name and value pairs to pass to the managed application as parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A mapping of name and value pairs to pass to the managed application as parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param plan One `plan` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<ApplicationPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan One `plan` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder plan(ApplicationPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Managed Application should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.managedResourceGroupName = Objects.requireNonNull($.managedResourceGroupName, "expected parameter 'managedResourceGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
