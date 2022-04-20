// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamMemberState Empty = new Hl7StoreIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition;

    public Output<Hl7StoreIamMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the HL7v2 store&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="hl7V2StoreId")
      private final @Nullable Output<String> hl7V2StoreId;

    public Output<String> hl7V2StoreId() {
        return this.hl7V2StoreId == null ? Codegen.empty() : this.hl7V2StoreId;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public Hl7StoreIamMemberState(
        @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> hl7V2StoreId,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.hl7V2StoreId = hl7V2StoreId;
        this.member = member;
        this.role = role;
    }

    private Hl7StoreIamMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.hl7V2StoreId = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> hl7V2StoreId;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<Hl7StoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable Hl7StoreIamMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder hl7V2StoreId(@Nullable Output<String> hl7V2StoreId) {
            this.hl7V2StoreId = hl7V2StoreId;
            return this;
        }
        public Builder hl7V2StoreId(@Nullable String hl7V2StoreId) {
            this.hl7V2StoreId = Codegen.ofNullable(hl7V2StoreId);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public Hl7StoreIamMemberState build() {
            return new Hl7StoreIamMemberState(condition, etag, hl7V2StoreId, member, role);
        }
    }
}
