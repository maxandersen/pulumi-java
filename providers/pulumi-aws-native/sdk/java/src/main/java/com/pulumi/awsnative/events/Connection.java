// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.events.ConnectionArgs;
import com.pulumi.awsnative.events.enums.ConnectionAuthorizationType;
import com.pulumi.awsnative.events.outputs.AuthParametersProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Events::Connection.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:events:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * The arn of the connection resource.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The arn of the connection resource.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="authParameters", type=AuthParametersProperties.class, parameters={})
    private Output<AuthParametersProperties> authParameters;

    public Output<AuthParametersProperties> authParameters() {
        return this.authParameters;
    }
    @Export(name="authorizationType", type=ConnectionAuthorizationType.class, parameters={})
    private Output<ConnectionAuthorizationType> authorizationType;

    public Output<ConnectionAuthorizationType> authorizationType() {
        return this.authorizationType;
    }
    /**
     * Description of the connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the connection.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Name of the connection.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the connection.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The arn of the secrets manager secret created in the customer account.
     * 
     */
    @Export(name="secretArn", type=String.class, parameters={})
    private Output<String> secretArn;

    /**
     * @return The arn of the secrets manager secret created in the customer account.
     * 
     */
    public Output<String> secretArn() {
        return this.secretArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:events:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:events:Connection", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}
