// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Power BI output data source.
 * 
 */
public final class PowerBIOutputDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerBIOutputDataSourceArgs Empty = new PowerBIOutputDataSourceArgs();

    /**
     * The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * The ID of the Power BI group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * A refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Output<String> refreshToken;

    public Optional<Output<String>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    /**
     * The name of the Power BI table under the specified dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * The user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserDisplayName")
    private @Nullable Output<String> tokenUserDisplayName;

    public Optional<Output<String>> tokenUserDisplayName() {
        return Optional.ofNullable(this.tokenUserDisplayName);
    }

    /**
     * The user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserPrincipalName")
    private @Nullable Output<String> tokenUserPrincipalName;

    public Optional<Output<String>> tokenUserPrincipalName() {
        return Optional.ofNullable(this.tokenUserPrincipalName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;PowerBI&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private PowerBIOutputDataSourceArgs() {}

    private PowerBIOutputDataSourceArgs(PowerBIOutputDataSourceArgs $) {
        this.dataset = $.dataset;
        this.groupId = $.groupId;
        this.groupName = $.groupName;
        this.refreshToken = $.refreshToken;
        this.table = $.table;
        this.tokenUserDisplayName = $.tokenUserDisplayName;
        this.tokenUserPrincipalName = $.tokenUserPrincipalName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerBIOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerBIOutputDataSourceArgs $;

        public Builder() {
            $ = new PowerBIOutputDataSourceArgs();
        }

        public Builder(PowerBIOutputDataSourceArgs defaults) {
            $ = new PowerBIOutputDataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            return refreshToken(Output.of(refreshToken));
        }

        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        public Builder table(String table) {
            return table(Output.of(table));
        }

        public Builder tokenUserDisplayName(@Nullable Output<String> tokenUserDisplayName) {
            $.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }

        public Builder tokenUserDisplayName(String tokenUserDisplayName) {
            return tokenUserDisplayName(Output.of(tokenUserDisplayName));
        }

        public Builder tokenUserPrincipalName(@Nullable Output<String> tokenUserPrincipalName) {
            $.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }

        public Builder tokenUserPrincipalName(String tokenUserPrincipalName) {
            return tokenUserPrincipalName(Output.of(tokenUserPrincipalName));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PowerBIOutputDataSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
