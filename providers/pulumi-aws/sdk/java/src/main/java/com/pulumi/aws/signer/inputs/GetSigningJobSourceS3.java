// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSigningJobSourceS3 extends com.pulumi.resources.InvokeArgs {

    public static final GetSigningJobSourceS3 Empty = new GetSigningJobSourceS3();

    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private GetSigningJobSourceS3() {}

    private GetSigningJobSourceS3(GetSigningJobSourceS3 $) {
        this.bucket = $.bucket;
        this.key = $.key;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSigningJobSourceS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSigningJobSourceS3 $;

        public Builder() {
            $ = new GetSigningJobSourceS3();
        }

        public Builder(GetSigningJobSourceS3 defaults) {
            $ = new GetSigningJobSourceS3(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public GetSigningJobSourceS3 build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
