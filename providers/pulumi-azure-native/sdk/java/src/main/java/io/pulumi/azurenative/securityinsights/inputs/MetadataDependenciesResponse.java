// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex dependencies.
 * 
 */
public final class MetadataDependenciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataDependenciesResponse Empty = new MetadataDependenciesResponse();

    /**
     * Id of the content item we depend on
     * 
     */
    @Import(name="contentId")
      private final @Nullable String contentId;

    public Optional<String> contentId() {
        return this.contentId == null ? Optional.empty() : Optional.ofNullable(this.contentId);
    }

    /**
     * This is the list of dependencies we must fulfill, according to the AND/OR operator
     * 
     */
    @Import(name="criteria")
      private final @Nullable List<MetadataDependenciesResponse> criteria;

    public List<MetadataDependenciesResponse> criteria() {
        return this.criteria == null ? List.of() : this.criteria;
    }

    /**
     * Type of the content item we depend on
     * 
     */
    @Import(name="kind")
      private final @Nullable String kind;

    public Optional<String> kind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Name of the content item
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Operator used for list of dependencies in criteria array.
     * 
     */
    @Import(name="operator")
      private final @Nullable String operator;

    public Optional<String> operator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    /**
     * Version of the the content item we depend on.  Can be blank, * or missing to indicate any version fulfills the dependency.  If version does not match our defined numeric format then an exact match is required.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public MetadataDependenciesResponse(
        @Nullable String contentId,
        @Nullable List<MetadataDependenciesResponse> criteria,
        @Nullable String kind,
        @Nullable String name,
        @Nullable String operator,
        @Nullable String version) {
        this.contentId = contentId;
        this.criteria = criteria;
        this.kind = kind;
        this.name = name;
        this.operator = operator;
        this.version = version;
    }

    private MetadataDependenciesResponse() {
        this.contentId = null;
        this.criteria = List.of();
        this.kind = null;
        this.name = null;
        this.operator = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataDependenciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentId;
        private @Nullable List<MetadataDependenciesResponse> criteria;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String operator;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataDependenciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentId = defaults.contentId;
    	      this.criteria = defaults.criteria;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.version = defaults.version;
        }

        public Builder contentId(@Nullable String contentId) {
            this.contentId = contentId;
            return this;
        }
        public Builder criteria(@Nullable List<MetadataDependenciesResponse> criteria) {
            this.criteria = criteria;
            return this;
        }
        public Builder criteria(MetadataDependenciesResponse... criteria) {
            return criteria(List.of(criteria));
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public MetadataDependenciesResponse build() {
            return new MetadataDependenciesResponse(contentId, criteria, kind, name, operator, version);
        }
    }
}
