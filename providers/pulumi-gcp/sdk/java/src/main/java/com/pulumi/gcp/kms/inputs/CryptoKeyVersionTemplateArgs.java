// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyVersionTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionTemplateArgs Empty = new CryptoKeyVersionTemplateArgs();

    /**
     * The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    @Import(name="algorithm", required=true)
      private final Output<String> algorithm;

    public Output<String> algorithm() {
        return this.algorithm;
    }

    /**
     * The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
     * 
     */
    @Import(name="protectionLevel")
      private final @Nullable Output<String> protectionLevel;

    public Output<String> protectionLevel() {
        return this.protectionLevel == null ? Codegen.empty() : this.protectionLevel;
    }

    public CryptoKeyVersionTemplateArgs(
        Output<String> algorithm,
        @Nullable Output<String> protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = protectionLevel;
    }

    private CryptoKeyVersionTemplateArgs() {
        this.algorithm = Codegen.empty();
        this.protectionLevel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> algorithm;
        private @Nullable Output<String> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder algorithm(Output<String> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder algorithm(String algorithm) {
            this.algorithm = Output.of(Objects.requireNonNull(algorithm));
            return this;
        }
        public Builder protectionLevel(@Nullable Output<String> protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public Builder protectionLevel(@Nullable String protectionLevel) {
            this.protectionLevel = Codegen.ofNullable(protectionLevel);
            return this;
        }        public CryptoKeyVersionTemplateArgs build() {
            return new CryptoKeyVersionTemplateArgs(algorithm, protectionLevel);
        }
    }
}
