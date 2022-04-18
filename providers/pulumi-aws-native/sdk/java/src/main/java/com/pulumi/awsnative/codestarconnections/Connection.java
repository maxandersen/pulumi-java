// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codestarconnections;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.codestarconnections.ConnectionArgs;
import com.pulumi.awsnative.codestarconnections.outputs.ConnectionTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for AWS::CodeStarConnections::Connection resource which can be used to connect external source providers with AWS CodePipeline
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:codestarconnections:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the  connection. The ARN is used as the connection reference when the connection is shared between AWS services.
     * 
     */
    @Export(name="connectionArn", type=String.class, parameters={})
    private Output<String> connectionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the  connection. The ARN is used as the connection reference when the connection is shared between AWS services.
     * 
     */
    public Output<String> connectionArn() {
        return this.connectionArn;
    }
    /**
     * The name of the connection. Connection names must be unique in an AWS user account.
     * 
     */
    @Export(name="connectionName", type=String.class, parameters={})
    private Output<String> connectionName;

    /**
     * @return The name of the connection. Connection names must be unique in an AWS user account.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }
    /**
     * The current status of the connection.
     * 
     */
    @Export(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return The current status of the connection.
     * 
     */
    public Output<String> connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * The host arn configured to represent the infrastructure where your third-party provider is installed. You must specify either a ProviderType or a HostArn.
     * 
     */
    @Export(name="hostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostArn;

    /**
     * @return The host arn configured to represent the infrastructure where your third-party provider is installed. You must specify either a ProviderType or a HostArn.
     * 
     */
    public Output</* @Nullable */ String> hostArn() {
        return this.hostArn;
    }
    /**
     * The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
     * 
     */
    @Export(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return The name of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The name of the external provider where your third-party code repository is configured. You must specify either a ProviderType or a HostArn.
     * 
     */
    @Export(name="providerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerType;

    /**
     * @return The name of the external provider where your third-party code repository is configured. You must specify either a ProviderType or a HostArn.
     * 
     */
    public Output</* @Nullable */ String> providerType() {
        return this.providerType;
    }
    /**
     * Specifies the tags applied to a connection.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ConnectionTag.class})
    private Output</* @Nullable */ List<ConnectionTag>> tags;

    /**
     * @return Specifies the tags applied to a connection.
     * 
     */
    public Output</* @Nullable */ List<ConnectionTag>> tags() {
        return this.tags;
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
    public Connection(String name, @Nullable ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, @Nullable ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarconnections:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:codestarconnections:Connection", name, null, makeResourceOptions(options, id));
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
