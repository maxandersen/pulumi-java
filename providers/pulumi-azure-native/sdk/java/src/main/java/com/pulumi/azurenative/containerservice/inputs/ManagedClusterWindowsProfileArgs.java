// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.enums.LicenseType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for Windows VMs in the container service cluster.
 * 
 */
public final class ManagedClusterWindowsProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterWindowsProfileArgs Empty = new ManagedClusterWindowsProfileArgs();

    /**
     * Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34;
     * 
     */
    @Import(name="adminPassword")
    private @Nullable Output<String> adminPassword;

    /**
     * @return Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34;
     * 
     */
    public Optional<Output<String>> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }

    /**
     * Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters
     * 
     */
    @Import(name="adminUsername", required=true)
    private Output<String> adminUsername;

    /**
     * @return Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters
     * 
     */
    public Output<String> adminUsername() {
        return this.adminUsername;
    }

    /**
     * Whether to enable CSI proxy.
     * 
     */
    @Import(name="enableCSIProxy")
    private @Nullable Output<Boolean> enableCSIProxy;

    /**
     * @return Whether to enable CSI proxy.
     * 
     */
    public Optional<Output<Boolean>> enableCSIProxy() {
        return Optional.ofNullable(this.enableCSIProxy);
    }

    /**
     * The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,LicenseType>> licenseType;

    /**
     * @return The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
     * 
     */
    public Optional<Output<Either<String,LicenseType>>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    private ManagedClusterWindowsProfileArgs() {}

    private ManagedClusterWindowsProfileArgs(ManagedClusterWindowsProfileArgs $) {
        this.adminPassword = $.adminPassword;
        this.adminUsername = $.adminUsername;
        this.enableCSIProxy = $.enableCSIProxy;
        this.licenseType = $.licenseType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterWindowsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterWindowsProfileArgs $;

        public Builder() {
            $ = new ManagedClusterWindowsProfileArgs();
        }

        public Builder(ManagedClusterWindowsProfileArgs defaults) {
            $ = new ManagedClusterWindowsProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminPassword Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34;
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword Specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length:** 8 characters &lt;br&gt;&lt;br&gt; **Max-length:** 123 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;abc@123&#34;, &#34;P@$$w0rd&#34;, &#34;P@ssw0rd&#34;, &#34;P@ssword123&#34;, &#34;Pa$$word&#34;, &#34;pass@word1&#34;, &#34;Password!&#34;, &#34;Password1&#34;, &#34;Password22&#34;, &#34;iloveyou!&#34;
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param adminUsername Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(Output<String> adminUsername) {
            $.adminUsername = adminUsername;
            return this;
        }

        /**
         * @param adminUsername Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **restriction:** Cannot end in &#34;.&#34; &lt;br&gt;&lt;br&gt; **Disallowed values:** &#34;administrator&#34;, &#34;admin&#34;, &#34;user&#34;, &#34;user1&#34;, &#34;test&#34;, &#34;user2&#34;, &#34;test1&#34;, &#34;user3&#34;, &#34;admin1&#34;, &#34;1&#34;, &#34;123&#34;, &#34;a&#34;, &#34;actuser&#34;, &#34;adm&#34;, &#34;admin2&#34;, &#34;aspnet&#34;, &#34;backup&#34;, &#34;console&#34;, &#34;david&#34;, &#34;guest&#34;, &#34;john&#34;, &#34;owner&#34;, &#34;root&#34;, &#34;server&#34;, &#34;sql&#34;, &#34;support&#34;, &#34;support_388945a0&#34;, &#34;sys&#34;, &#34;test2&#34;, &#34;test3&#34;, &#34;user4&#34;, &#34;user5&#34;. &lt;br&gt;&lt;br&gt; **Minimum-length:** 1 character &lt;br&gt;&lt;br&gt; **Max-length:** 20 characters
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(String adminUsername) {
            return adminUsername(Output.of(adminUsername));
        }

        /**
         * @param enableCSIProxy Whether to enable CSI proxy.
         * 
         * @return builder
         * 
         */
        public Builder enableCSIProxy(@Nullable Output<Boolean> enableCSIProxy) {
            $.enableCSIProxy = enableCSIProxy;
            return this;
        }

        /**
         * @param enableCSIProxy Whether to enable CSI proxy.
         * 
         * @return builder
         * 
         */
        public Builder enableCSIProxy(Boolean enableCSIProxy) {
            return enableCSIProxy(Output.of(enableCSIProxy));
        }

        /**
         * @param licenseType The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<Either<String,LicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(Either<String,LicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param licenseType The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Either.ofLeft(licenseType));
        }

        /**
         * @param licenseType The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(LicenseType licenseType) {
            return licenseType(Either.ofRight(licenseType));
        }

        public ManagedClusterWindowsProfileArgs build() {
            $.adminUsername = Objects.requireNonNull($.adminUsername, "expected parameter 'adminUsername' to be non-null");
            return $;
        }
    }

}
