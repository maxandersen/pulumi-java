// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.SsisEnvironmentReferenceResponse;
import com.pulumi.azurenative.synapse.outputs.SsisParameterResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SsisProjectResponse {
    /**
     * Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * Environment reference in project
     * 
     */
    private final @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;
    /**
     * Folder id which contains project.
     * 
     */
    private final @Nullable Double folderId;
    /**
     * Metadata id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Metadata name.
     * 
     */
    private final @Nullable String name;
    /**
     * Parameters in project
     * 
     */
    private final @Nullable List<SsisParameterResponse> parameters;
    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Project&#39;.
     * 
     */
    private final String type;
    /**
     * Project version.
     * 
     */
    private final @Nullable Double version;

    @CustomType.Constructor
    private SsisProjectResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("environmentRefs") @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs,
        @CustomType.Parameter("folderId") @Nullable Double folderId,
        @CustomType.Parameter("id") @Nullable Double id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("parameters") @Nullable List<SsisParameterResponse> parameters,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable Double version) {
        this.description = description;
        this.environmentRefs = environmentRefs;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.type = type;
        this.version = version;
    }

    /**
     * Metadata description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Environment reference in project
     * 
    */
    public List<SsisEnvironmentReferenceResponse> environmentRefs() {
        return this.environmentRefs == null ? List.of() : this.environmentRefs;
    }
    /**
     * Folder id which contains project.
     * 
    */
    public Optional<Double> folderId() {
        return Optional.ofNullable(this.folderId);
    }
    /**
     * Metadata id.
     * 
    */
    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Metadata name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Parameters in project
     * 
    */
    public List<SsisParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Project&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Project version.
     * 
    */
    public Optional<Double> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisProjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable List<SsisParameterResponse> parameters;
        private String type;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisProjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentRefs = defaults.environmentRefs;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder environmentRefs(@Nullable List<SsisEnvironmentReferenceResponse> environmentRefs) {
            this.environmentRefs = environmentRefs;
            return this;
        }
        public Builder environmentRefs(SsisEnvironmentReferenceResponse... environmentRefs) {
            return environmentRefs(List.of(environmentRefs));
        }
        public Builder folderId(@Nullable Double folderId) {
            this.folderId = folderId;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder parameters(@Nullable List<SsisParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(SsisParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable Double version) {
            this.version = version;
            return this;
        }        public SsisProjectResponse build() {
            return new SsisProjectResponse(description, environmentRefs, folderId, id, name, parameters, type, version);
        }
    }
}
