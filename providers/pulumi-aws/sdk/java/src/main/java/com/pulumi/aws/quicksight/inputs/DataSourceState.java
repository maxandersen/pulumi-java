// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.aws.quicksight.inputs.DataSourceCredentialsGetArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceParametersGetArgs;
import com.pulumi.aws.quicksight.inputs.DataSourcePermissionGetArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesGetArgs;
import com.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceState extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceState Empty = new DataSourceState();

    /**
     * Amazon Resource Name (ARN) of the data source
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<DataSourceCredentialsGetArgs> credentials;

    public Optional<Output<DataSourceCredentialsGetArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * An identifier for the data source.
     * 
     */
    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    /**
     * A name for the data source, maximum of 128 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parameters used to connect to this data source (exactly one).
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<DataSourceParametersGetArgs> parameters;

    public Optional<Output<DataSourceParametersGetArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<DataSourcePermissionGetArgs>> permissions;

    public Optional<Output<List<DataSourcePermissionGetArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * 
     */
    @Import(name="sslProperties")
    private @Nullable Output<DataSourceSslPropertiesGetArgs> sslProperties;

    public Optional<Output<DataSourceSslPropertiesGetArgs>> sslProperties() {
        return Optional.ofNullable(this.sslProperties);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * 
     */
    @Import(name="vpcConnectionProperties")
    private @Nullable Output<DataSourceVpcConnectionPropertiesGetArgs> vpcConnectionProperties;

    public Optional<Output<DataSourceVpcConnectionPropertiesGetArgs>> vpcConnectionProperties() {
        return Optional.ofNullable(this.vpcConnectionProperties);
    }

    private DataSourceState() {}

    private DataSourceState(DataSourceState $) {
        this.arn = $.arn;
        this.awsAccountId = $.awsAccountId;
        this.credentials = $.credentials;
        this.dataSourceId = $.dataSourceId;
        this.name = $.name;
        this.parameters = $.parameters;
        this.permissions = $.permissions;
        this.sslProperties = $.sslProperties;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.type = $.type;
        this.vpcConnectionProperties = $.vpcConnectionProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceState $;

        public Builder() {
            $ = new DataSourceState();
        }

        public Builder(DataSourceState defaults) {
            $ = new DataSourceState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        public Builder credentials(@Nullable Output<DataSourceCredentialsGetArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(DataSourceCredentialsGetArgs credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameters(@Nullable Output<DataSourceParametersGetArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(DataSourceParametersGetArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder permissions(@Nullable Output<List<DataSourcePermissionGetArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<DataSourcePermissionGetArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(DataSourcePermissionGetArgs... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder sslProperties(@Nullable Output<DataSourceSslPropertiesGetArgs> sslProperties) {
            $.sslProperties = sslProperties;
            return this;
        }

        public Builder sslProperties(DataSourceSslPropertiesGetArgs sslProperties) {
            return sslProperties(Output.of(sslProperties));
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

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder vpcConnectionProperties(@Nullable Output<DataSourceVpcConnectionPropertiesGetArgs> vpcConnectionProperties) {
            $.vpcConnectionProperties = vpcConnectionProperties;
            return this;
        }

        public Builder vpcConnectionProperties(DataSourceVpcConnectionPropertiesGetArgs vpcConnectionProperties) {
            return vpcConnectionProperties(Output.of(vpcConnectionProperties));
        }

        public DataSourceState build() {
            return $;
        }
    }

}
