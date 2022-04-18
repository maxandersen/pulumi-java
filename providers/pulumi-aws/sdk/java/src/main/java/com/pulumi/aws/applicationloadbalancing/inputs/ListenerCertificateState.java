// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerCertificateState Empty = new ListenerCertificateState();

    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn == null ? Codegen.empty() : this.certificateArn;
    }

    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @Import(name="listenerArn")
      private final @Nullable Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn == null ? Codegen.empty() : this.listenerArn;
    }

    public ListenerCertificateState(
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> listenerArn) {
        this.certificateArn = certificateArn;
        this.listenerArn = listenerArn;
    }

    private ListenerCertificateState() {
        this.certificateArn = Codegen.empty();
        this.listenerArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> listenerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.listenerArn = defaults.listenerArn;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Codegen.ofNullable(certificateArn);
            return this;
        }
        public Builder listenerArn(@Nullable Output<String> listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }
        public Builder listenerArn(@Nullable String listenerArn) {
            this.listenerArn = Codegen.ofNullable(listenerArn);
            return this;
        }        public ListenerCertificateState build() {
            return new ListenerCertificateState(certificateArn, listenerArn);
        }
    }
}
