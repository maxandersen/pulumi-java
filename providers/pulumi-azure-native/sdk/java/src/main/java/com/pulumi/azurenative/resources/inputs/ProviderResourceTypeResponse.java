// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.azurenative.resources.inputs.AliasResponse;
import com.pulumi.azurenative.resources.inputs.ApiProfileResponse;
import com.pulumi.azurenative.resources.inputs.ProviderExtendedLocationResponse;
import com.pulumi.azurenative.resources.inputs.ZoneMappingResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource type managed by the resource provider.
 * 
 */
public final class ProviderResourceTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProviderResourceTypeResponse Empty = new ProviderResourceTypeResponse();

    /**
     * The aliases that are supported by this resource type.
     * 
     */
    @Import(name="aliases")
      private final @Nullable List<AliasResponse> aliases;

    public List<AliasResponse> aliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }

    /**
     * The API profiles for the resource provider.
     * 
     */
    @Import(name="apiProfiles", required=true)
      private final List<ApiProfileResponse> apiProfiles;

    public List<ApiProfileResponse> apiProfiles() {
        return this.apiProfiles;
    }

    /**
     * The API version.
     * 
     */
    @Import(name="apiVersions")
      private final @Nullable List<String> apiVersions;

    public List<String> apiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }

    /**
     * The additional capabilities offered by this resource type.
     * 
     */
    @Import(name="capabilities")
      private final @Nullable String capabilities;

    public Optional<String> capabilities() {
        return this.capabilities == null ? Optional.empty() : Optional.ofNullable(this.capabilities);
    }

    /**
     * The default API version.
     * 
     */
    @Import(name="defaultApiVersion", required=true)
      private final String defaultApiVersion;

    public String defaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * The location mappings that are supported by this resource type.
     * 
     */
    @Import(name="locationMappings")
      private final @Nullable List<ProviderExtendedLocationResponse> locationMappings;

    public List<ProviderExtendedLocationResponse> locationMappings() {
        return this.locationMappings == null ? List.of() : this.locationMappings;
    }

    /**
     * The collection of locations where this resource type can be created.
     * 
     */
    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }

    /**
     * The properties.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable String resourceType;

    public Optional<String> resourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    @Import(name="zoneMappings")
      private final @Nullable List<ZoneMappingResponse> zoneMappings;

    public List<ZoneMappingResponse> zoneMappings() {
        return this.zoneMappings == null ? List.of() : this.zoneMappings;
    }

    public ProviderResourceTypeResponse(
        @Nullable List<AliasResponse> aliases,
        List<ApiProfileResponse> apiProfiles,
        @Nullable List<String> apiVersions,
        @Nullable String capabilities,
        String defaultApiVersion,
        @Nullable List<ProviderExtendedLocationResponse> locationMappings,
        @Nullable List<String> locations,
        @Nullable Map<String,String> properties,
        @Nullable String resourceType,
        @Nullable List<ZoneMappingResponse> zoneMappings) {
        this.aliases = aliases;
        this.apiProfiles = Objects.requireNonNull(apiProfiles, "expected parameter 'apiProfiles' to be non-null");
        this.apiVersions = apiVersions;
        this.capabilities = capabilities;
        this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion, "expected parameter 'defaultApiVersion' to be non-null");
        this.locationMappings = locationMappings;
        this.locations = locations;
        this.properties = properties;
        this.resourceType = resourceType;
        this.zoneMappings = zoneMappings;
    }

    private ProviderResourceTypeResponse() {
        this.aliases = List.of();
        this.apiProfiles = List.of();
        this.apiVersions = List.of();
        this.capabilities = null;
        this.defaultApiVersion = null;
        this.locationMappings = List.of();
        this.locations = List.of();
        this.properties = Map.of();
        this.resourceType = null;
        this.zoneMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResourceTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AliasResponse> aliases;
        private List<ApiProfileResponse> apiProfiles;
        private @Nullable List<String> apiVersions;
        private @Nullable String capabilities;
        private String defaultApiVersion;
        private @Nullable List<ProviderExtendedLocationResponse> locationMappings;
        private @Nullable List<String> locations;
        private @Nullable Map<String,String> properties;
        private @Nullable String resourceType;
        private @Nullable List<ZoneMappingResponse> zoneMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResourceTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apiProfiles = defaults.apiProfiles;
    	      this.apiVersions = defaults.apiVersions;
    	      this.capabilities = defaults.capabilities;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.locationMappings = defaults.locationMappings;
    	      this.locations = defaults.locations;
    	      this.properties = defaults.properties;
    	      this.resourceType = defaults.resourceType;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        public Builder aliases(@Nullable List<AliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(AliasResponse... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder apiProfiles(List<ApiProfileResponse> apiProfiles) {
            this.apiProfiles = Objects.requireNonNull(apiProfiles);
            return this;
        }
        public Builder apiProfiles(ApiProfileResponse... apiProfiles) {
            return apiProfiles(List.of(apiProfiles));
        }
        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        public Builder capabilities(@Nullable String capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder defaultApiVersion(String defaultApiVersion) {
            this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion);
            return this;
        }
        public Builder locationMappings(@Nullable List<ProviderExtendedLocationResponse> locationMappings) {
            this.locationMappings = locationMappings;
            return this;
        }
        public Builder locationMappings(ProviderExtendedLocationResponse... locationMappings) {
            return locationMappings(List.of(locationMappings));
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder zoneMappings(@Nullable List<ZoneMappingResponse> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public Builder zoneMappings(ZoneMappingResponse... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }        public ProviderResourceTypeResponse build() {
            return new ProviderResourceTypeResponse(aliases, apiProfiles, apiVersions, capabilities, defaultApiVersion, locationMappings, locations, properties, resourceType, zoneMappings);
        }
    }
}
