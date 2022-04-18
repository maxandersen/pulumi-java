// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionCommitmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionCommitmentArgs Empty = new GetRegionCommitmentArgs();

    @Import(name="commitment", required=true)
      private final String commitment;

    public String commitment() {
        return this.commitment;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    public GetRegionCommitmentArgs(
        String commitment,
        @Nullable String project,
        String region) {
        this.commitment = Objects.requireNonNull(commitment, "expected parameter 'commitment' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionCommitmentArgs() {
        this.commitment = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder commitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRegionCommitmentArgs build() {
            return new GetRegionCommitmentArgs(commitment, project, region);
        }
    }
}
