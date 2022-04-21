// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=email)&#39;
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private String labAccountName;

    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private String labName;

    public String labName() {
        return this.labName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    public String userName() {
        return this.userName;
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.expand = $.expand;
        this.labAccountName = $.labAccountName;
        this.labName = $.labName;
        this.resourceGroupName = $.resourceGroupName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder labAccountName(String labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        public Builder labName(String labName) {
            $.labName = labName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetUserArgs build() {
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
