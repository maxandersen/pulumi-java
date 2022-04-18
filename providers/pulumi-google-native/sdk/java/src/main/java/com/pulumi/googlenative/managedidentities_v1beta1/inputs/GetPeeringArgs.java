// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringArgs Empty = new GetPeeringArgs();

    @Import(name="peeringId", required=true)
      private final String peeringId;

    public String peeringId() {
        return this.peeringId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetPeeringArgs(
        String peeringId,
        @Nullable String project) {
        this.peeringId = Objects.requireNonNull(peeringId, "expected parameter 'peeringId' to be non-null");
        this.project = project;
    }

    private GetPeeringArgs() {
        this.peeringId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeringId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringId = defaults.peeringId;
    	      this.project = defaults.project;
        }

        public Builder peeringId(String peeringId) {
            this.peeringId = Objects.requireNonNull(peeringId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetPeeringArgs build() {
            return new GetPeeringArgs(peeringId, project);
        }
    }
}
