// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListenerCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerCertificateArgs Empty = new ListenerCertificateArgs();

    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @Import(name="certificateArn", required=true)
    private Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn;
    }

    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @Import(name="listenerArn", required=true)
    private Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    private ListenerCertificateArgs() {}

    private ListenerCertificateArgs(ListenerCertificateArgs $) {
        this.certificateArn = $.certificateArn;
        this.listenerArn = $.listenerArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerCertificateArgs $;

        public Builder() {
            $ = new ListenerCertificateArgs();
        }

        public Builder(ListenerCertificateArgs defaults) {
            $ = new ListenerCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateArn(Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder listenerArn(Output<String> listenerArn) {
            $.listenerArn = listenerArn;
            return this;
        }

        public Builder listenerArn(String listenerArn) {
            return listenerArn(Output.of(listenerArn));
        }

        public ListenerCertificateArgs build() {
            $.certificateArn = Objects.requireNonNull($.certificateArn, "expected parameter 'certificateArn' to be non-null");
            $.listenerArn = Objects.requireNonNull($.listenerArn, "expected parameter 'listenerArn' to be non-null");
            return $;
        }
    }

}
