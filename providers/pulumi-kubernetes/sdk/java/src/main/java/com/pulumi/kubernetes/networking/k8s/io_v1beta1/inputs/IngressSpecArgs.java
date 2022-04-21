// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressBackendArgs;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressRuleArgs;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressTLSArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressSpec describes the Ingress the user wishes to exist.
 * 
 */
public final class IngressSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressSpecArgs Empty = new IngressSpecArgs();

    /**
     * A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<IngressBackendArgs> backend;

    public Optional<Output<IngressBackendArgs>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    @Import(name="ingressClassName")
    private @Nullable Output<String> ingressClassName;

    public Optional<Output<String>> ingressClassName() {
        return Optional.ofNullable(this.ingressClassName);
    }

    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<IngressRuleArgs>> rules;

    public Optional<Output<List<IngressRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<List<IngressTLSArgs>> tls;

    public Optional<Output<List<IngressTLSArgs>>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private IngressSpecArgs() {}

    private IngressSpecArgs(IngressSpecArgs $) {
        this.backend = $.backend;
        this.ingressClassName = $.ingressClassName;
        this.rules = $.rules;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressSpecArgs $;

        public Builder() {
            $ = new IngressSpecArgs();
        }

        public Builder(IngressSpecArgs defaults) {
            $ = new IngressSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder backend(@Nullable Output<IngressBackendArgs> backend) {
            $.backend = backend;
            return this;
        }

        public Builder backend(IngressBackendArgs backend) {
            return backend(Output.of(backend));
        }

        public Builder ingressClassName(@Nullable Output<String> ingressClassName) {
            $.ingressClassName = ingressClassName;
            return this;
        }

        public Builder ingressClassName(String ingressClassName) {
            return ingressClassName(Output.of(ingressClassName));
        }

        public Builder rules(@Nullable Output<List<IngressRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<IngressRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(IngressRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder tls(@Nullable Output<List<IngressTLSArgs>> tls) {
            $.tls = tls;
            return this;
        }

        public Builder tls(List<IngressTLSArgs> tls) {
            return tls(Output.of(tls));
        }

        public Builder tls(IngressTLSArgs... tls) {
            return tls(List.of(tls));
        }

        public IngressSpecArgs build() {
            return $;
        }
    }

}
