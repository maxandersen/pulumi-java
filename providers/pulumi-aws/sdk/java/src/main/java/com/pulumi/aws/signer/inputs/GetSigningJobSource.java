// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.aws.signer.inputs.GetSigningJobSourceS3;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetSigningJobSource extends com.pulumi.resources.InvokeArgs {

    public static final GetSigningJobSource Empty = new GetSigningJobSource();

    @Import(name="s3s", required=true)
      private final List<GetSigningJobSourceS3> s3s;

    public List<GetSigningJobSourceS3> s3s() {
        return this.s3s;
    }

    public GetSigningJobSource(List<GetSigningJobSourceS3> s3s) {
        this.s3s = Objects.requireNonNull(s3s, "expected parameter 's3s' to be non-null");
    }

    private GetSigningJobSource() {
        this.s3s = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSigningJobSourceS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder s3s(List<GetSigningJobSourceS3> s3s) {
            this.s3s = Objects.requireNonNull(s3s);
            return this;
        }
        public Builder s3s(GetSigningJobSourceS3... s3s) {
            return s3s(List.of(s3s));
        }        public GetSigningJobSource build() {
            return new GetSigningJobSource(s3s);
        }
    }
}
