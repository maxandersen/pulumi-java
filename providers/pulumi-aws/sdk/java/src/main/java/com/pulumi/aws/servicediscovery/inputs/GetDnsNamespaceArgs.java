// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDnsNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsNamespaceArgs Empty = new GetDnsNamespaceArgs();

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the namespace.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The type of the namespace. Allowed values are `DNS_PUBLIC` or `DNS_PRIVATE`.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the namespace. Allowed values are `DNS_PUBLIC` or `DNS_PRIVATE`.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetDnsNamespaceArgs() {}

    private GetDnsNamespaceArgs(GetDnsNamespaceArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsNamespaceArgs $;

        public Builder() {
            $ = new GetDnsNamespaceArgs();
        }

        public Builder(GetDnsNamespaceArgs defaults) {
            $ = new GetDnsNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The type of the namespace. Allowed values are `DNS_PUBLIC` or `DNS_PRIVATE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetDnsNamespaceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
