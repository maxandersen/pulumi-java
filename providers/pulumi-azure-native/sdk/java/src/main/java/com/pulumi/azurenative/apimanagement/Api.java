// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiArgs;
import com.pulumi.azurenative.apimanagement.outputs.ApiVersionSetContractDetailsResponse;
import com.pulumi.azurenative.apimanagement.outputs.AuthenticationSettingsContractResponse;
import com.pulumi.azurenative.apimanagement.outputs.SubscriptionKeyParameterNamesContractResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Api details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Api soapApi /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/soapApi 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Api")
public class Api extends com.pulumi.resources.CustomResource {
    /**
     * Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    @Export(name="apiRevision", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevision;

    /**
     * @return Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    public Output<Optional<String>> apiRevision() {
        return Codegen.optional(this.apiRevision);
    }
    /**
     * Description of the Api Revision.
     * 
     */
    @Export(name="apiRevisionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevisionDescription;

    /**
     * @return Description of the Api Revision.
     * 
     */
    public Output<Optional<String>> apiRevisionDescription() {
        return Codegen.optional(this.apiRevisionDescription);
    }
    /**
     * Type of API.
     * 
     */
    @Export(name="apiType", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiType;

    /**
     * @return Type of API.
     * 
     */
    public Output<Optional<String>> apiType() {
        return Codegen.optional(this.apiType);
    }
    /**
     * Indicates the Version identifier of the API if the API is versioned
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return Indicates the Version identifier of the API if the API is versioned
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    /**
     * Description of the Api Version.
     * 
     */
    @Export(name="apiVersionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionDescription;

    /**
     * @return Description of the Api Version.
     * 
     */
    public Output<Optional<String>> apiVersionDescription() {
        return Codegen.optional(this.apiVersionDescription);
    }
    /**
     * Version set details
     * 
     */
    @Export(name="apiVersionSet", type=ApiVersionSetContractDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ApiVersionSetContractDetailsResponse> apiVersionSet;

    /**
     * @return Version set details
     * 
     */
    public Output<Optional<ApiVersionSetContractDetailsResponse>> apiVersionSet() {
        return Codegen.optional(this.apiVersionSet);
    }
    /**
     * A resource identifier for the related ApiVersionSet.
     * 
     */
    @Export(name="apiVersionSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionSetId;

    /**
     * @return A resource identifier for the related ApiVersionSet.
     * 
     */
    public Output<Optional<String>> apiVersionSetId() {
        return Codegen.optional(this.apiVersionSetId);
    }
    /**
     * Collection of authentication settings included into this API.
     * 
     */
    @Export(name="authenticationSettings", type=AuthenticationSettingsContractResponse.class, parameters={})
    private Output</* @Nullable */ AuthenticationSettingsContractResponse> authenticationSettings;

    /**
     * @return Collection of authentication settings included into this API.
     * 
     */
    public Output<Optional<AuthenticationSettingsContractResponse>> authenticationSettings() {
        return Codegen.optional(this.authenticationSettings);
    }
    /**
     * Description of the API. May include HTML formatting tags.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the API. May include HTML formatting tags.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * API name. Must be 1 to 300 characters long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return API name. Must be 1 to 300 characters long.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Indicates if API revision is current api revision.
     * 
     */
    @Export(name="isCurrent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isCurrent;

    /**
     * @return Indicates if API revision is current api revision.
     * 
     */
    public Output<Optional<Boolean>> isCurrent() {
        return Codegen.optional(this.isCurrent);
    }
    /**
     * Indicates if API revision is accessible via the gateway.
     * 
     */
    @Export(name="isOnline", type=Boolean.class, parameters={})
    private Output<Boolean> isOnline;

    /**
     * @return Indicates if API revision is accessible via the gateway.
     * 
     */
    public Output<Boolean> isOnline() {
        return this.isOnline;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Describes on which protocols the operations in this API can be invoked.
     * 
     */
    @Export(name="protocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> protocols;

    /**
     * @return Describes on which protocols the operations in this API can be invoked.
     * 
     */
    public Output<Optional<List<String>>> protocols() {
        return Codegen.optional(this.protocols);
    }
    /**
     * Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    @Export(name="serviceUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceUrl;

    /**
     * @return Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    public Output<Optional<String>> serviceUrl() {
        return Codegen.optional(this.serviceUrl);
    }
    /**
     * API identifier of the source API.
     * 
     */
    @Export(name="sourceApiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceApiId;

    /**
     * @return API identifier of the source API.
     * 
     */
    public Output<Optional<String>> sourceApiId() {
        return Codegen.optional(this.sourceApiId);
    }
    /**
     * Protocols over which API is made available.
     * 
     */
    @Export(name="subscriptionKeyParameterNames", type=SubscriptionKeyParameterNamesContractResponse.class, parameters={})
    private Output</* @Nullable */ SubscriptionKeyParameterNamesContractResponse> subscriptionKeyParameterNames;

    /**
     * @return Protocols over which API is made available.
     * 
     */
    public Output<Optional<SubscriptionKeyParameterNamesContractResponse>> subscriptionKeyParameterNames() {
        return Codegen.optional(this.subscriptionKeyParameterNames);
    }
    /**
     * Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    @Export(name="subscriptionRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subscriptionRequired;

    /**
     * @return Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    public Output<Optional<Boolean>> subscriptionRequired() {
        return Codegen.optional(this.subscriptionRequired);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Api(String name) {
        this(name, ApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Api(String name, ApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Api(String name, ApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Api", name, args == null ? ApiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Api(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Api", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:Api").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:Api").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Api get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Api(name, id, options);
    }
}
