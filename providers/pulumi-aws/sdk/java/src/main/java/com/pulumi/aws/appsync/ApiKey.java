// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appsync.ApiKeyArgs;
import com.pulumi.aws.appsync.inputs.ApiKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppSync API Key.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appsync_api_key` can be imported using the AppSync API ID and key separated by `:`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/apiKey:ApiKey example xxxxx:yyyyy
 * ```
 * 
 */
@ResourceType(type="aws:appsync/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the associated AppSync API
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The ID of the associated AppSync API
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @Export(name="expires", type=String.class, parameters={})
    private Output</* @Nullable */ String> expires;

    /**
     * @return RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    public Output</* @Nullable */ String> expires() {
        return this.expires;
    }
    /**
     * The API key
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The API key
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
