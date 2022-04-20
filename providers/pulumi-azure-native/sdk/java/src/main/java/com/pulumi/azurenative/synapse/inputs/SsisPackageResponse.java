// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.SsisParameterResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis Package.
 * 
 */
public final class SsisPackageResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisPackageResponse Empty = new SsisPackageResponse();

    /**
     * Metadata description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Folder id which contains package.
     * 
     */
    @Import(name="folderId")
      private final @Nullable Double folderId;

    public Optional<Double> folderId() {
        return this.folderId == null ? Optional.empty() : Optional.ofNullable(this.folderId);
    }

    /**
     * Metadata id.
     * 
     */
    @Import(name="id")
      private final @Nullable Double id;

    public Optional<Double> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Metadata name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Parameters in package
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<SsisParameterResponse> parameters;

    public List<SsisParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Project id which contains package.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Double projectId;

    public Optional<Double> projectId() {
        return this.projectId == null ? Optional.empty() : Optional.ofNullable(this.projectId);
    }

    /**
     * Project version which contains package.
     * 
     */
    @Import(name="projectVersion")
      private final @Nullable Double projectVersion;

    public Optional<Double> projectVersion() {
        return this.projectVersion == null ? Optional.empty() : Optional.ofNullable(this.projectVersion);
    }

    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Package&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SsisPackageResponse(
        @Nullable String description,
        @Nullable Double folderId,
        @Nullable Double id,
        @Nullable String name,
        @Nullable List<SsisParameterResponse> parameters,
        @Nullable Double projectId,
        @Nullable Double projectVersion,
        String type) {
        this.description = description;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.projectId = projectId;
        this.projectVersion = projectVersion;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private SsisPackageResponse() {
        this.description = null;
        this.folderId = null;
        this.id = null;
        this.name = null;
        this.parameters = List.of();
        this.projectId = null;
        this.projectVersion = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable List<SsisParameterResponse> parameters;
        private @Nullable Double projectId;
        private @Nullable Double projectVersion;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.projectId = defaults.projectId;
    	      this.projectVersion = defaults.projectVersion;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
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
        public Builder projectId(@Nullable Double projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectVersion(@Nullable Double projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SsisPackageResponse build() {
            return new SsisPackageResponse(description, folderId, id, name, parameters, projectId, projectVersion, type);
        }
    }
}
