// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.servicefabricmesh.inputs.DiagnosticsDescriptionArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ServiceResourceDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The identity of the application.
     * 
     */
    @Import(name="applicationResourceName")
    private @Nullable Output<String> applicationResourceName;

    /**
     * @return The identity of the application.
     * 
     */
    public Optional<Output<String>> applicationResourceName() {
        return Optional.ofNullable(this.applicationResourceName);
    }

    /**
     * Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    @Import(name="debugParams")
    private @Nullable Output<String> debugParams;

    /**
     * @return Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    public Optional<Output<String>> debugParams() {
        return Optional.ofNullable(this.debugParams);
    }

    /**
     * User readable description of the application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User readable description of the application.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Describes the diagnostics definition and usage for an application resource.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable Output<DiagnosticsDescriptionArgs> diagnostics;

    /**
     * @return Describes the diagnostics definition and usage for an application resource.
     * 
     */
    public Optional<Output<DiagnosticsDescriptionArgs>> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Azure resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<ServiceResourceDescriptionArgs>> services;

    /**
     * @return Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    public Optional<Output<List<ServiceResourceDescriptionArgs>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.applicationResourceName = $.applicationResourceName;
        this.debugParams = $.debugParams;
        this.description = $.description;
        this.diagnostics = $.diagnostics;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.services = $.services;
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
         * @param applicationResourceName The identity of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationResourceName(@Nullable Output<String> applicationResourceName) {
            $.applicationResourceName = applicationResourceName;
            return this;
        }

        /**
         * @param applicationResourceName The identity of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationResourceName(String applicationResourceName) {
            return applicationResourceName(Output.of(applicationResourceName));
        }

        /**
         * @param debugParams Internal - used by Visual Studio to setup the debugging session on the local development environment.
         * 
         * @return builder
         * 
         */
        public Builder debugParams(@Nullable Output<String> debugParams) {
            $.debugParams = debugParams;
            return this;
        }

        /**
         * @param debugParams Internal - used by Visual Studio to setup the debugging session on the local development environment.
         * 
         * @return builder
         * 
         */
        public Builder debugParams(String debugParams) {
            return debugParams(Output.of(debugParams));
        }

        /**
         * @param description User readable description of the application.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User readable description of the application.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diagnostics Describes the diagnostics definition and usage for an application resource.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(@Nullable Output<DiagnosticsDescriptionArgs> diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        /**
         * @param diagnostics Describes the diagnostics definition and usage for an application resource.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(DiagnosticsDescriptionArgs diagnostics) {
            return diagnostics(Output.of(diagnostics));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param services Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<ServiceResourceDescriptionArgs>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
         * 
         * @return builder
         * 
         */
        public Builder services(List<ServiceResourceDescriptionArgs> services) {
            return services(Output.of(services));
        }

        /**
         * @param services Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
         * 
         * @return builder
         * 
         */
        public Builder services(ServiceResourceDescriptionArgs... services) {
            return services(List.of(services));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
