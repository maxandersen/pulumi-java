// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata common to many entities in this API.
 * 
 */
public final class GoogleCloudApigeeV1EntityMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1EntityMetadataResponse Empty = new GoogleCloudApigeeV1EntityMetadataResponse();

    /**
     * Time at which the API proxy was created, in milliseconds since epoch.
     * 
     */
    @Import(name="createdAt", required=true)
      private final String createdAt;

    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Time at which the API proxy was most recently modified, in milliseconds since epoch.
     * 
     */
    @Import(name="lastModifiedAt", required=true)
      private final String lastModifiedAt;

    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * The type of entity described
     * 
     */
    @Import(name="subType", required=true)
      private final String subType;

    public String subType() {
        return this.subType;
    }

    public GoogleCloudApigeeV1EntityMetadataResponse(
        String createdAt,
        String lastModifiedAt,
        String subType) {
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
        this.subType = Objects.requireNonNull(subType, "expected parameter 'subType' to be non-null");
    }

    private GoogleCloudApigeeV1EntityMetadataResponse() {
        this.createdAt = null;
        this.lastModifiedAt = null;
        this.subType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String lastModifiedAt;
        private String subType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.subType = defaults.subType;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder subType(String subType) {
            this.subType = Objects.requireNonNull(subType);
            return this;
        }        public GoogleCloudApigeeV1EntityMetadataResponse build() {
            return new GoogleCloudApigeeV1EntityMetadataResponse(createdAt, lastModifiedAt, subType);
        }
    }
}
