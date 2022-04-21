// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.AppType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    /**
     * The name of the app.
     * 
     */
    @Import(name="appName", required=true)
    private String appName;

    public String appName() {
        return this.appName;
    }

    /**
     * The type of app.
     * 
     */
    @Import(name="appType", required=true)
    private AppType appType;

    public AppType appType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @Import(name="domainId", required=true)
    private String domainId;

    public String domainId() {
        return this.domainId;
    }

    /**
     * The user profile name.
     * 
     */
    @Import(name="userProfileName", required=true)
    private String userProfileName;

    public String userProfileName() {
        return this.userProfileName;
    }

    private GetAppArgs() {}

    private GetAppArgs(GetAppArgs $) {
        this.appName = $.appName;
        this.appType = $.appType;
        this.domainId = $.domainId;
        this.userProfileName = $.userProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppArgs $;

        public Builder() {
            $ = new GetAppArgs();
        }

        public Builder(GetAppArgs defaults) {
            $ = new GetAppArgs(Objects.requireNonNull(defaults));
        }

        public Builder appName(String appName) {
            $.appName = appName;
            return this;
        }

        public Builder appType(AppType appType) {
            $.appType = appType;
            return this;
        }

        public Builder domainId(String domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder userProfileName(String userProfileName) {
            $.userProfileName = userProfileName;
            return this;
        }

        public GetAppArgs build() {
            $.appName = Objects.requireNonNull($.appName, "expected parameter 'appName' to be non-null");
            $.appType = Objects.requireNonNull($.appType, "expected parameter 'appType' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            $.userProfileName = Objects.requireNonNull($.userProfileName, "expected parameter 'userProfileName' to be non-null");
            return $;
        }
    }

}
