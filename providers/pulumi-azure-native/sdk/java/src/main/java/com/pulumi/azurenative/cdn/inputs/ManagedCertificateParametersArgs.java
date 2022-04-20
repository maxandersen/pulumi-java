// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Managed Certificate used for https
 * 
 */
public final class ManagedCertificateParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedCertificateParametersArgs Empty = new ManagedCertificateParametersArgs();

    /**
     * The type of the Secret to create.
     * Expected value is &#39;ManagedCertificate&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ManagedCertificateParametersArgs(Output<String> type) {
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private ManagedCertificateParametersArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedCertificateParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedCertificateParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ManagedCertificateParametersArgs build() {
            return new ManagedCertificateParametersArgs(type);
        }
    }
}
