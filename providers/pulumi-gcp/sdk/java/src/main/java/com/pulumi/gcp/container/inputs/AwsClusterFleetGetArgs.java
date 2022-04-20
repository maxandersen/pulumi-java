// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterFleetGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsClusterFleetGetArgs Empty = new AwsClusterFleetGetArgs();

    /**
     * - 
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
     * 
     */
    @Import(name="membership")
      private final @Nullable Output<String> membership;

    public Output<String> membership() {
        return this.membership == null ? Codegen.empty() : this.membership;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public AwsClusterFleetGetArgs(
        @Nullable Output<String> membership,
        @Nullable Output<String> project) {
        this.membership = membership;
        this.project = project;
    }

    private AwsClusterFleetGetArgs() {
        this.membership = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterFleetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> membership;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterFleetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder membership(@Nullable Output<String> membership) {
            this.membership = membership;
            return this;
        }
        public Builder membership(@Nullable String membership) {
            this.membership = Codegen.ofNullable(membership);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public AwsClusterFleetGetArgs build() {
            return new AwsClusterFleetGetArgs(membership, project);
        }
    }
}
