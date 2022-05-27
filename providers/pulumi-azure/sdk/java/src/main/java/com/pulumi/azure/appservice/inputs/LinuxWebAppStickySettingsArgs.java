// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxWebAppStickySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppStickySettingsArgs Empty = new LinuxWebAppStickySettingsArgs();

    /**
     * A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    @Import(name="appSettingNames")
    private @Nullable Output<List<String>> appSettingNames;

    /**
     * @return A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public Optional<Output<List<String>>> appSettingNames() {
        return Optional.ofNullable(this.appSettingNames);
    }

    /**
     * A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    @Import(name="connectionStringNames")
    private @Nullable Output<List<String>> connectionStringNames;

    /**
     * @return A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public Optional<Output<List<String>>> connectionStringNames() {
        return Optional.ofNullable(this.connectionStringNames);
    }

    private LinuxWebAppStickySettingsArgs() {}

    private LinuxWebAppStickySettingsArgs(LinuxWebAppStickySettingsArgs $) {
        this.appSettingNames = $.appSettingNames;
        this.connectionStringNames = $.connectionStringNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppStickySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppStickySettingsArgs $;

        public Builder() {
            $ = new LinuxWebAppStickySettingsArgs();
        }

        public Builder(LinuxWebAppStickySettingsArgs defaults) {
            $ = new LinuxWebAppStickySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appSettingNames A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder appSettingNames(@Nullable Output<List<String>> appSettingNames) {
            $.appSettingNames = appSettingNames;
            return this;
        }

        /**
         * @param appSettingNames A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder appSettingNames(List<String> appSettingNames) {
            return appSettingNames(Output.of(appSettingNames));
        }

        /**
         * @param appSettingNames A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder appSettingNames(String... appSettingNames) {
            return appSettingNames(List.of(appSettingNames));
        }

        /**
         * @param connectionStringNames A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringNames(@Nullable Output<List<String>> connectionStringNames) {
            $.connectionStringNames = connectionStringNames;
            return this;
        }

        /**
         * @param connectionStringNames A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringNames(List<String> connectionStringNames) {
            return connectionStringNames(Output.of(connectionStringNames));
        }

        /**
         * @param connectionStringNames A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringNames(String... connectionStringNames) {
            return connectionStringNames(List.of(connectionStringNames));
        }

        public LinuxWebAppStickySettingsArgs build() {
            return $;
        }
    }

}
