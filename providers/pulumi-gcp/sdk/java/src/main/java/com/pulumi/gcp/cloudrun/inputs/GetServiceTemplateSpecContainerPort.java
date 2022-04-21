// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerPort extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerPort Empty = new GetServiceTemplateSpecContainerPort();

    @Import(name="containerPort", required=true)
    private Integer containerPort;

    public Integer containerPort() {
        return this.containerPort;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="protocol", required=true)
    private String protocol;

    public String protocol() {
        return this.protocol;
    }

    private GetServiceTemplateSpecContainerPort() {}

    private GetServiceTemplateSpecContainerPort(GetServiceTemplateSpecContainerPort $) {
        this.containerPort = $.containerPort;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTemplateSpecContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTemplateSpecContainerPort $;

        public Builder() {
            $ = new GetServiceTemplateSpecContainerPort();
        }

        public Builder(GetServiceTemplateSpecContainerPort defaults) {
            $ = new GetServiceTemplateSpecContainerPort(Objects.requireNonNull(defaults));
        }

        public Builder containerPort(Integer containerPort) {
            $.containerPort = containerPort;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder protocol(String protocol) {
            $.protocol = protocol;
            return this;
        }

        public GetServiceTemplateSpecContainerPort build() {
            $.containerPort = Objects.requireNonNull($.containerPort, "expected parameter 'containerPort' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
