// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaxonomyIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaxonomyIamPolicyArgs Empty = new GetTaxonomyIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="taxonomyId", required=true)
      private final String taxonomyId;

    public String taxonomyId() {
        return this.taxonomyId;
    }

    public GetTaxonomyIamPolicyArgs(
        String location,
        @Nullable String project,
        String taxonomyId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.taxonomyId = Objects.requireNonNull(taxonomyId, "expected parameter 'taxonomyId' to be non-null");
    }

    private GetTaxonomyIamPolicyArgs() {
        this.location = null;
        this.project = null;
        this.taxonomyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String taxonomyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.taxonomyId = defaults.taxonomyId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder taxonomyId(String taxonomyId) {
            this.taxonomyId = Objects.requireNonNull(taxonomyId);
            return this;
        }        public GetTaxonomyIamPolicyArgs build() {
            return new GetTaxonomyIamPolicyArgs(location, project, taxonomyId);
        }
    }
}
