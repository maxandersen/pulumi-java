// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.ApplicationScopedVolumeResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerInstanceViewResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerLabelResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.EndpointPropertiesResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ImageRegistryCredentialResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ReliableCollectionsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ResourceRequirementsResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.SettingResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.VolumeReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerCodePackagePropertiesResponse {
    /**
     * Command array to execute within the container in exec form.
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    private final @Nullable DiagnosticsRefResponse diagnostics;
    /**
     * The endpoints exposed by this container.
     * 
     */
    private final @Nullable List<EndpointPropertiesResponse> endpoints;
    /**
     * Override for the default entry point in the container.
     * 
     */
    private final @Nullable String entrypoint;
    /**
     * The environment variables to set in this container
     * 
     */
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * The Container image to use.
     * 
     */
    private final String image;
    /**
     * Image registry credential.
     * 
     */
    private final @Nullable ImageRegistryCredentialResponse imageRegistryCredential;
    /**
     * Runtime information of a container instance.
     * 
     */
    private final ContainerInstanceViewResponse instanceView;
    /**
     * The labels to set in this container.
     * 
     */
    private final @Nullable List<ContainerLabelResponse> labels;
    /**
     * The name of the code package.
     * 
     */
    private final String name;
    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
     */
    private final @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs;
    /**
     * The resources required by this container.
     * 
     */
    private final ResourceRequirementsResponse resources;
    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is "/var/secrets".
     * 
     */
    private final @Nullable List<SettingResponse> settings;
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's lifetime.
     * 
     */
    private final @Nullable List<VolumeReferenceResponse> volumeRefs;
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     * 
     */
    private final @Nullable List<ApplicationScopedVolumeResponse> volumes;

    @CustomType.Constructor
    private ContainerCodePackagePropertiesResponse(
        @CustomType.Parameter("commands") @Nullable List<String> commands,
        @CustomType.Parameter("diagnostics") @Nullable DiagnosticsRefResponse diagnostics,
        @CustomType.Parameter("endpoints") @Nullable List<EndpointPropertiesResponse> endpoints,
        @CustomType.Parameter("entrypoint") @Nullable String entrypoint,
        @CustomType.Parameter("environmentVariables") @Nullable List<EnvironmentVariableResponse> environmentVariables,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("imageRegistryCredential") @Nullable ImageRegistryCredentialResponse imageRegistryCredential,
        @CustomType.Parameter("instanceView") ContainerInstanceViewResponse instanceView,
        @CustomType.Parameter("labels") @Nullable List<ContainerLabelResponse> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("reliableCollectionsRefs") @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs,
        @CustomType.Parameter("resources") ResourceRequirementsResponse resources,
        @CustomType.Parameter("settings") @Nullable List<SettingResponse> settings,
        @CustomType.Parameter("volumeRefs") @Nullable List<VolumeReferenceResponse> volumeRefs,
        @CustomType.Parameter("volumes") @Nullable List<ApplicationScopedVolumeResponse> volumes) {
        this.commands = commands;
        this.diagnostics = diagnostics;
        this.endpoints = endpoints;
        this.entrypoint = entrypoint;
        this.environmentVariables = environmentVariables;
        this.image = image;
        this.imageRegistryCredential = imageRegistryCredential;
        this.instanceView = instanceView;
        this.labels = labels;
        this.name = name;
        this.reliableCollectionsRefs = reliableCollectionsRefs;
        this.resources = resources;
        this.settings = settings;
        this.volumeRefs = volumeRefs;
        this.volumes = volumes;
    }

    /**
     * Command array to execute within the container in exec form.
     * 
    */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
    */
    public Optional<DiagnosticsRefResponse> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * The endpoints exposed by this container.
     * 
    */
    public List<EndpointPropertiesResponse> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * Override for the default entry point in the container.
     * 
    */
    public Optional<String> entrypoint() {
        return Optional.ofNullable(this.entrypoint);
    }
    /**
     * The environment variables to set in this container
     * 
    */
    public List<EnvironmentVariableResponse> environmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * The Container image to use.
     * 
    */
    public String image() {
        return this.image;
    }
    /**
     * Image registry credential.
     * 
    */
    public Optional<ImageRegistryCredentialResponse> imageRegistryCredential() {
        return Optional.ofNullable(this.imageRegistryCredential);
    }
    /**
     * Runtime information of a container instance.
     * 
    */
    public ContainerInstanceViewResponse instanceView() {
        return this.instanceView;
    }
    /**
     * The labels to set in this container.
     * 
    */
    public List<ContainerLabelResponse> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The name of the code package.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
    */
    public List<ReliableCollectionsRefResponse> reliableCollectionsRefs() {
        return this.reliableCollectionsRefs == null ? List.of() : this.reliableCollectionsRefs;
    }
    /**
     * The resources required by this container.
     * 
    */
    public ResourceRequirementsResponse resources() {
        return this.resources;
    }
    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is "/var/secrets".
     * 
    */
    public List<SettingResponse> settings() {
        return this.settings == null ? List.of() : this.settings;
    }
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's lifetime.
     * 
    */
    public List<VolumeReferenceResponse> volumeRefs() {
        return this.volumeRefs == null ? List.of() : this.volumeRefs;
    }
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     * 
    */
    public List<ApplicationScopedVolumeResponse> volumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCodePackagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> commands;
        private @Nullable DiagnosticsRefResponse diagnostics;
        private @Nullable List<EndpointPropertiesResponse> endpoints;
        private @Nullable String entrypoint;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private String image;
        private @Nullable ImageRegistryCredentialResponse imageRegistryCredential;
        private ContainerInstanceViewResponse instanceView;
        private @Nullable List<ContainerLabelResponse> labels;
        private String name;
        private @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs;
        private ResourceRequirementsResponse resources;
        private @Nullable List<SettingResponse> settings;
        private @Nullable List<VolumeReferenceResponse> volumeRefs;
        private @Nullable List<ApplicationScopedVolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerCodePackagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.diagnostics = defaults.diagnostics;
    	      this.endpoints = defaults.endpoints;
    	      this.entrypoint = defaults.entrypoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.imageRegistryCredential = defaults.imageRegistryCredential;
    	      this.instanceView = defaults.instanceView;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.reliableCollectionsRefs = defaults.reliableCollectionsRefs;
    	      this.resources = defaults.resources;
    	      this.settings = defaults.settings;
    	      this.volumeRefs = defaults.volumeRefs;
    	      this.volumes = defaults.volumes;
        }

        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder diagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public Builder endpoints(@Nullable List<EndpointPropertiesResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(EndpointPropertiesResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder entrypoint(@Nullable String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public Builder environmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(EnvironmentVariableResponse... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder imageRegistryCredential(@Nullable ImageRegistryCredentialResponse imageRegistryCredential) {
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }
        public Builder instanceView(ContainerInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }
        public Builder labels(@Nullable List<ContainerLabelResponse> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(ContainerLabelResponse... labels) {
            return labels(List.of(labels));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder reliableCollectionsRefs(@Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs) {
            this.reliableCollectionsRefs = reliableCollectionsRefs;
            return this;
        }
        public Builder reliableCollectionsRefs(ReliableCollectionsRefResponse... reliableCollectionsRefs) {
            return reliableCollectionsRefs(List.of(reliableCollectionsRefs));
        }
        public Builder resources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder settings(@Nullable List<SettingResponse> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(SettingResponse... settings) {
            return settings(List.of(settings));
        }
        public Builder volumeRefs(@Nullable List<VolumeReferenceResponse> volumeRefs) {
            this.volumeRefs = volumeRefs;
            return this;
        }
        public Builder volumeRefs(VolumeReferenceResponse... volumeRefs) {
            return volumeRefs(List.of(volumeRefs));
        }
        public Builder volumes(@Nullable List<ApplicationScopedVolumeResponse> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(ApplicationScopedVolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }        public ContainerCodePackagePropertiesResponse build() {
            return new ContainerCodePackagePropertiesResponse(commands, diagnostics, endpoints, entrypoint, environmentVariables, image, imageRegistryCredential, instanceView, labels, name, reliableCollectionsRefs, resources, settings, volumeRefs, volumes);
        }
    }
}
