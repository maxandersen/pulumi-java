// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Google Cloud Storage object representation.
 * 
 */
public final class GcsObjectResponse extends com.pulumi.resources.InvokeArgs {

    public static final GcsObjectResponse Empty = new GcsObjectResponse();

    /**
     * Bucket of the Google Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Google Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    @Import(name="generationNumber", required=true)
    private String generationNumber;

    public String generationNumber() {
        return this.generationNumber;
    }

    /**
     * Name of the Google Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private String object;

    public String object() {
        return this.object;
    }

    private GcsObjectResponse() {}

    private GcsObjectResponse(GcsObjectResponse $) {
        this.bucket = $.bucket;
        this.generationNumber = $.generationNumber;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcsObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcsObjectResponse $;

        public Builder() {
            $ = new GcsObjectResponse();
        }

        public Builder(GcsObjectResponse defaults) {
            $ = new GcsObjectResponse(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder generationNumber(String generationNumber) {
            $.generationNumber = generationNumber;
            return this;
        }

        public Builder object(String object) {
            $.object = object;
            return this;
        }

        public GcsObjectResponse build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.generationNumber = Objects.requireNonNull($.generationNumber, "expected parameter 'generationNumber' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
