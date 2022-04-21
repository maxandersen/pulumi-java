// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeGetArgs;
import com.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationHdfsState extends com.pulumi.resources.ResourceArgs {

    public static final LocationHdfsState Empty = new LocationHdfsState();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Import(name="agentArns")
    private @Nullable Output<List<String>> agentArns;

    public Optional<Output<List<String>>> agentArns() {
        return Optional.ofNullable(this.agentArns);
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    @Import(name="blockSize")
    private @Nullable Output<Integer> blockSize;

    public Optional<Output<Integer>> blockSize() {
        return Optional.ofNullable(this.blockSize);
    }

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosKeytab")
    private @Nullable Output<String> kerberosKeytab;

    public Optional<Output<String>> kerberosKeytab() {
        return Optional.ofNullable(this.kerberosKeytab);
    }

    /**
     * The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosKrb5Conf")
    private @Nullable Output<String> kerberosKrb5Conf;

    public Optional<Output<String>> kerberosKrb5Conf() {
        return Optional.ofNullable(this.kerberosKrb5Conf);
    }

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosPrincipal")
    private @Nullable Output<String> kerberosPrincipal;

    public Optional<Output<String>> kerberosPrincipal() {
        return Optional.ofNullable(this.kerberosPrincipal);
    }

    /**
     * The URI of the HDFS cluster&#39;s Key Management Server (KMS).
     * 
     */
    @Import(name="kmsKeyProviderUri")
    private @Nullable Output<String> kmsKeyProviderUri;

    public Optional<Output<String>> kmsKeyProviderUri() {
        return Optional.ofNullable(this.kmsKeyProviderUri);
    }

    /**
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    @Import(name="nameNodes")
    private @Nullable Output<List<LocationHdfsNameNodeGetArgs>> nameNodes;

    public Optional<Output<List<LocationHdfsNameNodeGetArgs>>> nameNodes() {
        return Optional.ofNullable(this.nameNodes);
    }

    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If QopConfiguration isn&#39;t specified, RpcProtection and DataTransferProtection default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    @Import(name="qopConfiguration")
    private @Nullable Output<LocationHdfsQopConfigurationGetArgs> qopConfiguration;

    public Optional<Output<LocationHdfsQopConfigurationGetArgs>> qopConfiguration() {
        return Optional.ofNullable(this.qopConfiguration);
    }

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    @Import(name="replicationFactor")
    private @Nullable Output<Integer> replicationFactor;

    public Optional<Output<Integer>> replicationFactor() {
        return Optional.ofNullable(this.replicationFactor);
    }

    /**
     * The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="simpleUser")
    private @Nullable Output<String> simpleUser;

    public Optional<Output<String>> simpleUser() {
        return Optional.ofNullable(this.simpleUser);
    }

    /**
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn&#39;t specified, it will default to /.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private LocationHdfsState() {}

    private LocationHdfsState(LocationHdfsState $) {
        this.agentArns = $.agentArns;
        this.arn = $.arn;
        this.authenticationType = $.authenticationType;
        this.blockSize = $.blockSize;
        this.kerberosKeytab = $.kerberosKeytab;
        this.kerberosKrb5Conf = $.kerberosKrb5Conf;
        this.kerberosPrincipal = $.kerberosPrincipal;
        this.kmsKeyProviderUri = $.kmsKeyProviderUri;
        this.nameNodes = $.nameNodes;
        this.qopConfiguration = $.qopConfiguration;
        this.replicationFactor = $.replicationFactor;
        this.simpleUser = $.simpleUser;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationHdfsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationHdfsState $;

        public Builder() {
            $ = new LocationHdfsState();
        }

        public Builder(LocationHdfsState defaults) {
            $ = new LocationHdfsState(Objects.requireNonNull(defaults));
        }

        public Builder agentArns(@Nullable Output<List<String>> agentArns) {
            $.agentArns = agentArns;
            return this;
        }

        public Builder agentArns(List<String> agentArns) {
            return agentArns(Output.of(agentArns));
        }

        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder blockSize(@Nullable Output<Integer> blockSize) {
            $.blockSize = blockSize;
            return this;
        }

        public Builder blockSize(Integer blockSize) {
            return blockSize(Output.of(blockSize));
        }

        public Builder kerberosKeytab(@Nullable Output<String> kerberosKeytab) {
            $.kerberosKeytab = kerberosKeytab;
            return this;
        }

        public Builder kerberosKeytab(String kerberosKeytab) {
            return kerberosKeytab(Output.of(kerberosKeytab));
        }

        public Builder kerberosKrb5Conf(@Nullable Output<String> kerberosKrb5Conf) {
            $.kerberosKrb5Conf = kerberosKrb5Conf;
            return this;
        }

        public Builder kerberosKrb5Conf(String kerberosKrb5Conf) {
            return kerberosKrb5Conf(Output.of(kerberosKrb5Conf));
        }

        public Builder kerberosPrincipal(@Nullable Output<String> kerberosPrincipal) {
            $.kerberosPrincipal = kerberosPrincipal;
            return this;
        }

        public Builder kerberosPrincipal(String kerberosPrincipal) {
            return kerberosPrincipal(Output.of(kerberosPrincipal));
        }

        public Builder kmsKeyProviderUri(@Nullable Output<String> kmsKeyProviderUri) {
            $.kmsKeyProviderUri = kmsKeyProviderUri;
            return this;
        }

        public Builder kmsKeyProviderUri(String kmsKeyProviderUri) {
            return kmsKeyProviderUri(Output.of(kmsKeyProviderUri));
        }

        public Builder nameNodes(@Nullable Output<List<LocationHdfsNameNodeGetArgs>> nameNodes) {
            $.nameNodes = nameNodes;
            return this;
        }

        public Builder nameNodes(List<LocationHdfsNameNodeGetArgs> nameNodes) {
            return nameNodes(Output.of(nameNodes));
        }

        public Builder nameNodes(LocationHdfsNameNodeGetArgs... nameNodes) {
            return nameNodes(List.of(nameNodes));
        }

        public Builder qopConfiguration(@Nullable Output<LocationHdfsQopConfigurationGetArgs> qopConfiguration) {
            $.qopConfiguration = qopConfiguration;
            return this;
        }

        public Builder qopConfiguration(LocationHdfsQopConfigurationGetArgs qopConfiguration) {
            return qopConfiguration(Output.of(qopConfiguration));
        }

        public Builder replicationFactor(@Nullable Output<Integer> replicationFactor) {
            $.replicationFactor = replicationFactor;
            return this;
        }

        public Builder replicationFactor(Integer replicationFactor) {
            return replicationFactor(Output.of(replicationFactor));
        }

        public Builder simpleUser(@Nullable Output<String> simpleUser) {
            $.simpleUser = simpleUser;
            return this;
        }

        public Builder simpleUser(String simpleUser) {
            return simpleUser(Output.of(simpleUser));
        }

        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public LocationHdfsState build() {
            return $;
        }
    }

}
