// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs;
import com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<MembershipAuthorityArgs> authority;

    public Output<MembershipAuthorityArgs> authority() {
        return this.authority == null ? Codegen.empty() : this.authority;
    }

    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @Deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @Import(name="description")
      private final @Nullable Output<String> description;

    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<MembershipEndpointArgs> endpoint;

    public Output<MembershipEndpointArgs> endpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    /**
     * Labels to apply to this membership.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The client-provided identifier of the membership.
     * 
     */
    @Import(name="membershipId", required=true)
      private final Output<String> membershipId;

    public Output<String> membershipId() {
        return this.membershipId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public MembershipArgs(
        @Nullable Output<MembershipAuthorityArgs> authority,
        @Nullable Output<String> description,
        @Nullable Output<MembershipEndpointArgs> endpoint,
        @Nullable Output<Map<String,String>> labels,
        Output<String> membershipId,
        @Nullable Output<String> project) {
        this.authority = authority;
        this.description = description;
        this.endpoint = endpoint;
        this.labels = labels;
        this.membershipId = Objects.requireNonNull(membershipId, "expected parameter 'membershipId' to be non-null");
        this.project = project;
    }

    private MembershipArgs() {
        this.authority = Codegen.empty();
        this.description = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.labels = Codegen.empty();
        this.membershipId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MembershipAuthorityArgs> authority;
        private @Nullable Output<String> description;
        private @Nullable Output<MembershipEndpointArgs> endpoint;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> membershipId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.labels = defaults.labels;
    	      this.membershipId = defaults.membershipId;
    	      this.project = defaults.project;
        }

        public Builder authority(@Nullable Output<MembershipAuthorityArgs> authority) {
            this.authority = authority;
            return this;
        }
        public Builder authority(@Nullable MembershipAuthorityArgs authority) {
            this.authority = Codegen.ofNullable(authority);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder endpoint(@Nullable Output<MembershipEndpointArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable MembershipEndpointArgs endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder membershipId(Output<String> membershipId) {
            this.membershipId = Objects.requireNonNull(membershipId);
            return this;
        }
        public Builder membershipId(String membershipId) {
            this.membershipId = Output.of(Objects.requireNonNull(membershipId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public MembershipArgs build() {
            return new MembershipArgs(authority, description, endpoint, labels, membershipId, project);
        }
    }
}
