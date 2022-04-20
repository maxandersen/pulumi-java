// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipPreferredMemberKeyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipPreferredMemberKeyGetArgs Empty = new GroupMembershipPreferredMemberKeyGetArgs();

    /**
     * The ID of the entity.
     * For Google-managed entities, the id must be the email address of an existing
     * group or user.
     * For external-identity-mapped entities, the id must be a string conforming
     * to the Identity Source&#39;s requirements.
     * Must be unique within a namespace.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * The namespace in which the entity exists.
     * If not specified, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If specified, the EntityKey represents an external-identity-mapped group.
     * The namespace must correspond to an identity source created in Admin Console
     * and must be in the form of `identitysources/{identity_source_id}`.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    public GroupMembershipPreferredMemberKeyGetArgs(
        Output<String> id,
        @Nullable Output<String> namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = namespace;
    }

    private GroupMembershipPreferredMemberKeyGetArgs() {
        this.id = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipPreferredMemberKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipPreferredMemberKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }        public GroupMembershipPreferredMemberKeyGetArgs build() {
            return new GroupMembershipPreferredMemberKeyGetArgs(id, namespace);
        }
    }
}
