// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthenticationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainNameMutualTlsAuthenticationGetArgs Empty = new DomainNameMutualTlsAuthenticationGetArgs();

    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, `s3://bucket-name/key-name`.
     * The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version.
     * 
     */
    @Import(name="truststoreUri", required=true)
      private final Output<String> truststoreUri;

    public Output<String> truststoreUri() {
        return this.truststoreUri;
    }

    /**
     * The version of the S3 object that contains the truststore. To specify a version, you must have versioning enabled for the S3 bucket.
     * 
     */
    @Import(name="truststoreVersion")
      private final @Nullable Output<String> truststoreVersion;

    public Output<String> truststoreVersion() {
        return this.truststoreVersion == null ? Codegen.empty() : this.truststoreVersion;
    }

    public DomainNameMutualTlsAuthenticationGetArgs(
        Output<String> truststoreUri,
        @Nullable Output<String> truststoreVersion) {
        this.truststoreUri = Objects.requireNonNull(truststoreUri, "expected parameter 'truststoreUri' to be non-null");
        this.truststoreVersion = truststoreVersion;
    }

    private DomainNameMutualTlsAuthenticationGetArgs() {
        this.truststoreUri = Codegen.empty();
        this.truststoreVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthenticationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> truststoreUri;
        private @Nullable Output<String> truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthenticationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder truststoreUri(Output<String> truststoreUri) {
            this.truststoreUri = Objects.requireNonNull(truststoreUri);
            return this;
        }
        public Builder truststoreUri(String truststoreUri) {
            this.truststoreUri = Output.of(Objects.requireNonNull(truststoreUri));
            return this;
        }
        public Builder truststoreVersion(@Nullable Output<String> truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }
        public Builder truststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = Codegen.ofNullable(truststoreVersion);
            return this;
        }        public DomainNameMutualTlsAuthenticationGetArgs build() {
            return new DomainNameMutualTlsAuthenticationGetArgs(truststoreUri, truststoreVersion);
        }
    }
}
