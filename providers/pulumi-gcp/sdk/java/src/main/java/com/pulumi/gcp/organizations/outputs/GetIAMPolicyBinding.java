// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.organizations.outputs.GetIAMPolicyBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIAMPolicyBinding {
    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * 
     */
    private final @Nullable GetIAMPolicyBindingCondition condition;
    /**
     * An array of identities that will be granted the privilege in the `role`. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account. Some resources **don't** support this identity.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account. Some resources **don't** support this identity.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    private final List<String> members;
    /**
     * The role/permission that will be granted to the members.
     * See the [IAM Roles](https://cloud.google.com/compute/docs/access/iam) documentation for a complete list of roles.
     * Note that custom roles must be of the format `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    private final String role;

    @CustomType.Constructor
    private GetIAMPolicyBinding(
        @CustomType.Parameter("condition") @Nullable GetIAMPolicyBindingCondition condition,
        @CustomType.Parameter("members") List<String> members,
        @CustomType.Parameter("role") String role) {
        this.condition = condition;
        this.members = members;
        this.role = role;
    }

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * 
    */
    public Optional<GetIAMPolicyBindingCondition> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * An array of identities that will be granted the privilege in the `role`. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account. Some resources **don't** support this identity.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account. Some resources **don't** support this identity.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
    */
    public List<String> members() {
        return this.members;
    }
    /**
     * The role/permission that will be granted to the members.
     * See the [IAM Roles](https://cloud.google.com/compute/docs/access/iam) documentation for a complete list of roles.
     * Note that custom roles must be of the format `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
    */
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyBinding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetIAMPolicyBindingCondition condition;
        private List<String> members;
        private String role;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable GetIAMPolicyBindingCondition condition) {
            this.condition = condition;
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }        public GetIAMPolicyBinding build() {
            return new GetIAMPolicyBinding(condition, members, role);
        }
    }
}
