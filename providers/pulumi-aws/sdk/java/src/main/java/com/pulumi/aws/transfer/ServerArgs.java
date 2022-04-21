// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.transfer.inputs.ServerEndpointDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. This is required when `protocols` is set to `FTPS`
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The directory service ID of the directory service you want to connect to with an `identity_provider_type` of `AWS_DIRECTORY_SERVICE`.
     * 
     */
    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    /**
     * The domain of the storage system that is used for file transfers. Valid values are: `S3` and `EFS`. The default value is `S3`.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
     * 
     */
    @Import(name="endpointDetails")
    private @Nullable Output<ServerEndpointDetailsArgs> endpointDetails;

    public Optional<Output<ServerEndpointDetailsArgs>> endpointDetails() {
        return Optional.ofNullable(this.endpointDetails);
    }

    /**
     * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC` (or `VPC_ENDPOINT`), your SFTP server isn&#39;t accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
     * 
     */
    @Import(name="endpointType")
    private @Nullable Output<String> endpointType;

    public Optional<Output<String>> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    /**
     * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`. This option only applies to servers configured with a `SERVICE_MANAGED` `identity_provider_type`.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The ARN for a lambda function to use for the Identity provider.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * RSA private key (e.g., as generated by the `ssh-keygen -N &#34;&#34; -m PEM -f my-new-server-key` command).
     * 
     */
    @Import(name="hostKey")
    private @Nullable Output<String> hostKey;

    public Optional<Output<String>> hostKey() {
        return Optional.ofNullable(this.hostKey);
    }

    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice. Using `AWS_DIRECTORY_SERVICE` will allow for authentication against AWS Managed Active Directory or Microsoft Active Directory in your on-premises environment, or in AWS using AD Connectors. Use the `AWS_LAMBDA` value to directly use a Lambda function as your identity provider. If you choose this value, you must specify the ARN for the lambda function in the `function` argument.
     * 
     */
    @Import(name="identityProviderType")
    private @Nullable Output<String> identityProviderType;

    public Optional<Output<String>> identityProviderType() {
        return Optional.ofNullable(this.identityProviderType);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    @Import(name="invocationRole")
    private @Nullable Output<String> invocationRole;

    public Optional<Output<String>> invocationRole() {
        return Optional.ofNullable(this.invocationRole);
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
     */
    @Import(name="loggingRole")
    private @Nullable Output<String> loggingRole;

    public Optional<Output<String>> loggingRole() {
        return Optional.ofNullable(this.loggingRole);
    }

    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server&#39;s endpoint. This defaults to `SFTP` . The available protocols are:
     * * `SFTP`: File transfer over SSH
     * * `FTPS`: File transfer with TLS encryption
     * * `FTP`: Unencrypted file transfer
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Specifies the name of the security policy that is attached to the server. Possible values are `TransferSecurityPolicy-2018-11`, `TransferSecurityPolicy-2020-06`, and  `TransferSecurityPolicy-FIPS-2020-06`. Default value is: `TransferSecurityPolicy-2018-11`.
     * 
     */
    @Import(name="securityPolicyName")
    private @Nullable Output<String> securityPolicyName;

    public Optional<Output<String>> securityPolicyName() {
        return Optional.ofNullable(this.securityPolicyName);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * - URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.certificate = $.certificate;
        this.directoryId = $.directoryId;
        this.domain = $.domain;
        this.endpointDetails = $.endpointDetails;
        this.endpointType = $.endpointType;
        this.forceDestroy = $.forceDestroy;
        this.function = $.function;
        this.hostKey = $.hostKey;
        this.identityProviderType = $.identityProviderType;
        this.invocationRole = $.invocationRole;
        this.loggingRole = $.loggingRole;
        this.protocols = $.protocols;
        this.securityPolicyName = $.securityPolicyName;
        this.tags = $.tags;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder endpointDetails(@Nullable Output<ServerEndpointDetailsArgs> endpointDetails) {
            $.endpointDetails = endpointDetails;
            return this;
        }

        public Builder endpointDetails(ServerEndpointDetailsArgs endpointDetails) {
            return endpointDetails(Output.of(endpointDetails));
        }

        public Builder endpointType(@Nullable Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        public Builder function(String function) {
            return function(Output.of(function));
        }

        public Builder hostKey(@Nullable Output<String> hostKey) {
            $.hostKey = hostKey;
            return this;
        }

        public Builder hostKey(String hostKey) {
            return hostKey(Output.of(hostKey));
        }

        public Builder identityProviderType(@Nullable Output<String> identityProviderType) {
            $.identityProviderType = identityProviderType;
            return this;
        }

        public Builder identityProviderType(String identityProviderType) {
            return identityProviderType(Output.of(identityProviderType));
        }

        public Builder invocationRole(@Nullable Output<String> invocationRole) {
            $.invocationRole = invocationRole;
            return this;
        }

        public Builder invocationRole(String invocationRole) {
            return invocationRole(Output.of(invocationRole));
        }

        public Builder loggingRole(@Nullable Output<String> loggingRole) {
            $.loggingRole = loggingRole;
            return this;
        }

        public Builder loggingRole(String loggingRole) {
            return loggingRole(Output.of(loggingRole));
        }

        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder securityPolicyName(@Nullable Output<String> securityPolicyName) {
            $.securityPolicyName = securityPolicyName;
            return this;
        }

        public Builder securityPolicyName(String securityPolicyName) {
            return securityPolicyName(Output.of(securityPolicyName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ServerArgs build() {
            return $;
        }
    }

}
