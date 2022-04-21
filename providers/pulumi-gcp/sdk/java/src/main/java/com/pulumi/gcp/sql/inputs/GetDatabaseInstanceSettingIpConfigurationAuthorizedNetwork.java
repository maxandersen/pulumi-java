// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork Empty = new GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork();

    @Import(name="expirationTime", required=true)
    private String expirationTime;

    public String expirationTime() {
        return this.expirationTime;
    }

    /**
     * The name of the instance.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork() {}

    private GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork $) {
        this.expirationTime = $.expirationTime;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork $;

        public Builder() {
            $ = new GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork();
        }

        public Builder(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
            $ = new GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork(Objects.requireNonNull(defaults));
        }

        public Builder expirationTime(String expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork build() {
            $.expirationTime = Objects.requireNonNull($.expirationTime, "expected parameter 'expirationTime' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
