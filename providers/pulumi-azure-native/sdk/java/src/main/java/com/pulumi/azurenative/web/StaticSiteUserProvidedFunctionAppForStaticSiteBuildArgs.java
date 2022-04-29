// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs extends ResourceArgs {

    public static final StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs Empty = new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs();

    /**
     * The stage site identifier.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    /**
     * @return The stage site identifier.
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * Name of the function app to register with the static site build.
     * 
     */
    @Import(name="functionAppName")
    private @Nullable Output<String> functionAppName;

    /**
     * @return Name of the function app to register with the static site build.
     * 
     */
    public Optional<Output<String>> functionAppName() {
        return Optional.ofNullable(this.functionAppName);
    }

    /**
     * The region of the function app registered with the static site
     * 
     */
    @Import(name="functionAppRegion")
    private @Nullable Output<String> functionAppRegion;

    /**
     * @return The region of the function app registered with the static site
     * 
     */
    public Optional<Output<String>> functionAppRegion() {
        return Optional.ofNullable(this.functionAppRegion);
    }

    /**
     * The resource id of the function app registered with the static site
     * 
     */
    @Import(name="functionAppResourceId")
    private @Nullable Output<String> functionAppResourceId;

    /**
     * @return The resource id of the function app registered with the static site
     * 
     */
    public Optional<Output<String>> functionAppResourceId() {
        return Optional.ofNullable(this.functionAppResourceId);
    }

    /**
     * Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on the function app even if an AzureStaticWebApps provider is already configured on the function app. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="isForced")
    private @Nullable Output<Boolean> isForced;

    /**
     * @return Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on the function app even if an AzureStaticWebApps provider is already configured on the function app. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> isForced() {
        return Optional.ofNullable(this.isForced);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the static site.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs() {}

    private StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs $) {
        this.environmentName = $.environmentName;
        this.functionAppName = $.functionAppName;
        this.functionAppRegion = $.functionAppRegion;
        this.functionAppResourceId = $.functionAppResourceId;
        this.isForced = $.isForced;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs $;

        public Builder() {
            $ = new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs();
        }

        public Builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
            $ = new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The stage site identifier.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The stage site identifier.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param functionAppName Name of the function app to register with the static site build.
         * 
         * @return builder
         * 
         */
        public Builder functionAppName(@Nullable Output<String> functionAppName) {
            $.functionAppName = functionAppName;
            return this;
        }

        /**
         * @param functionAppName Name of the function app to register with the static site build.
         * 
         * @return builder
         * 
         */
        public Builder functionAppName(String functionAppName) {
            return functionAppName(Output.of(functionAppName));
        }

        /**
         * @param functionAppRegion The region of the function app registered with the static site
         * 
         * @return builder
         * 
         */
        public Builder functionAppRegion(@Nullable Output<String> functionAppRegion) {
            $.functionAppRegion = functionAppRegion;
            return this;
        }

        /**
         * @param functionAppRegion The region of the function app registered with the static site
         * 
         * @return builder
         * 
         */
        public Builder functionAppRegion(String functionAppRegion) {
            return functionAppRegion(Output.of(functionAppRegion));
        }

        /**
         * @param functionAppResourceId The resource id of the function app registered with the static site
         * 
         * @return builder
         * 
         */
        public Builder functionAppResourceId(@Nullable Output<String> functionAppResourceId) {
            $.functionAppResourceId = functionAppResourceId;
            return this;
        }

        /**
         * @param functionAppResourceId The resource id of the function app registered with the static site
         * 
         * @return builder
         * 
         */
        public Builder functionAppResourceId(String functionAppResourceId) {
            return functionAppResourceId(Output.of(functionAppResourceId));
        }

        /**
         * @param isForced Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on the function app even if an AzureStaticWebApps provider is already configured on the function app. The default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder isForced(@Nullable Output<Boolean> isForced) {
            $.isForced = isForced;
            return this;
        }

        /**
         * @param isForced Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on the function app even if an AzureStaticWebApps provider is already configured on the function app. The default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder isForced(Boolean isForced) {
            return isForced(Output.of(isForced));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
