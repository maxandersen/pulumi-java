// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketIamPolicyBindingsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBucketIamPolicyResult {
    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    private final List<BucketIamPolicyBindingsItemResponse> bindings;
    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
     */
    private final String etag;
    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    private final String kind;
    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    private final String resourceId;
    /**
     * The IAM policy format version.
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor
    private GetBucketIamPolicyResult(
        @OutputCustomType.Parameter("bindings") List<BucketIamPolicyBindingsItemResponse> bindings,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("resourceId") String resourceId,
        @OutputCustomType.Parameter("version") Integer version) {
        this.bindings = bindings;
        this.etag = etag;
        this.kind = kind;
        this.resourceId = resourceId;
        this.version = version;
    }

    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
    */
    public List<BucketIamPolicyBindingsItemResponse> getBindings() {
        return this.bindings;
    }
    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The IAM policy format version.
     * 
    */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketIamPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketIamPolicyBindingsItemResponse> bindings;
        private String etag;
        private String kind;
        private String resourceId;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.kind = defaults.kind;
    	      this.resourceId = defaults.resourceId;
    	      this.version = defaults.version;
        }

        public Builder setBindings(List<BucketIamPolicyBindingsItemResponse> bindings) {
            this.bindings = Objects.requireNonNull(bindings);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetBucketIamPolicyResult build() {
            return new GetBucketIamPolicyResult(bindings, etag, kind, resourceId, version);
        }
    }
}
