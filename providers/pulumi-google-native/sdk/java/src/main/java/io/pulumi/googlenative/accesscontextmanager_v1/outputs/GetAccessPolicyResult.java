// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAccessPolicyResult {
    /**
     * An opaque identifier for the current version of the `AccessPolicy`. This will always be a strongly validated etag, meaning that two Access Polices will be identical if and only if their etags are identical. Clients should not expect this to be in any specific format.
     * 
     */
    private final String etag;
    /**
     * Resource name of the `AccessPolicy`. Format: `accessPolicies/{access_policy}`
     * 
     */
    private final String name;
    /**
     * The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}`
     * 
     */
    private final String parent;
    /**
     * The scopes of a policy define which resources an ACM policy can restrict, and where ACM resources can be referenced. For example, a policy with scopes=["folders/123"] has the following behavior: - vpcsc perimeters can only restrict projects within folders/123 - access levels can only be referenced by resources within folders/123. If empty, there are no limitations on which resources can be restricted by an ACM policy, and there are no limitations on where ACM resources can be referenced. Only one policy can include a given scope (attempting to create a second policy which includes "folders/123" will result in an error). Currently, scopes cannot be modified after a policy is created. Currently, policies can only have a single scope. Format: list of `folders/{folder_number}` or `projects/{project_number}`
     * 
     */
    private final List<String> scopes;
    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor
    private GetAccessPolicyResult(
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parent") String parent,
        @OutputCustomType.Parameter("scopes") List<String> scopes,
        @OutputCustomType.Parameter("title") String title) {
        this.etag = etag;
        this.name = name;
        this.parent = parent;
        this.scopes = scopes;
        this.title = title;
    }

    /**
     * An opaque identifier for the current version of the `AccessPolicy`. This will always be a strongly validated etag, meaning that two Access Polices will be identical if and only if their etags are identical. Clients should not expect this to be in any specific format.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource name of the `AccessPolicy`. Format: `accessPolicies/{access_policy}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}`
     * 
    */
    public String getParent() {
        return this.parent;
    }
    /**
     * The scopes of a policy define which resources an ACM policy can restrict, and where ACM resources can be referenced. For example, a policy with scopes=["folders/123"] has the following behavior: - vpcsc perimeters can only restrict projects within folders/123 - access levels can only be referenced by resources within folders/123. If empty, there are no limitations on which resources can be restricted by an ACM policy, and there are no limitations on where ACM resources can be referenced. Only one policy can include a given scope (attempting to create a second policy which includes "folders/123" will result in an error). Currently, scopes cannot be modified after a policy is created. Currently, policies can only have a single scope. Format: list of `folders/{folder_number}` or `projects/{project_number}`
     * 
    */
    public List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Human readable title. Does not affect behavior.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String name;
        private String parent;
        private List<String> scopes;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.scopes = defaults.scopes;
    	      this.title = defaults.title;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(etag, name, parent, scopes, title);
        }
    }
}
