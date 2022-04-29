// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.WsdlImportMethod;
import com.pulumi.azurenative.web.inputs.WsdlService;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListCustomApiWsdlInterfacesArgs extends InvokeArgs {

    public static final ListCustomApiWsdlInterfacesArgs Empty = new ListCustomApiWsdlInterfacesArgs();

    /**
     * The WSDL content
     * 
     */
    @Import(name="content")
    private @Nullable String content;

    /**
     * @return The WSDL content
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The WSDL import method
     * 
     */
    @Import(name="importMethod")
    private @Nullable Either<String,WsdlImportMethod> importMethod;

    /**
     * @return The WSDL import method
     * 
     */
    public Optional<Either<String,WsdlImportMethod>> importMethod() {
        return Optional.ofNullable(this.importMethod);
    }

    /**
     * The location
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The service with name and endpoint names
     * 
     */
    @Import(name="service")
    private @Nullable WsdlService service;

    /**
     * @return The service with name and endpoint names
     * 
     */
    public Optional<WsdlService> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The WSDL URL
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return The WSDL URL
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private ListCustomApiWsdlInterfacesArgs() {}

    private ListCustomApiWsdlInterfacesArgs(ListCustomApiWsdlInterfacesArgs $) {
        this.content = $.content;
        this.importMethod = $.importMethod;
        this.location = $.location;
        this.service = $.service;
        this.subscriptionId = $.subscriptionId;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListCustomApiWsdlInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListCustomApiWsdlInterfacesArgs $;

        public Builder() {
            $ = new ListCustomApiWsdlInterfacesArgs();
        }

        public Builder(ListCustomApiWsdlInterfacesArgs defaults) {
            $ = new ListCustomApiWsdlInterfacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The WSDL content
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable String content) {
            $.content = content;
            return this;
        }

        /**
         * @param importMethod The WSDL import method
         * 
         * @return builder
         * 
         */
        public Builder importMethod(@Nullable Either<String,WsdlImportMethod> importMethod) {
            $.importMethod = importMethod;
            return this;
        }

        /**
         * @param importMethod The WSDL import method
         * 
         * @return builder
         * 
         */
        public Builder importMethod(String importMethod) {
            return importMethod(Either.ofLeft(importMethod));
        }

        /**
         * @param importMethod The WSDL import method
         * 
         * @return builder
         * 
         */
        public Builder importMethod(WsdlImportMethod importMethod) {
            return importMethod(Either.ofRight(importMethod));
        }

        /**
         * @param location The location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param service The service with name and endpoint names
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable WsdlService service) {
            $.service = service;
            return this;
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param url The WSDL URL
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public ListCustomApiWsdlInterfacesArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
