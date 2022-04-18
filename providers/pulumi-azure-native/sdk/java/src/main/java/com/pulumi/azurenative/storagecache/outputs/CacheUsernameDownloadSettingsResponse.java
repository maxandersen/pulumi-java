// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.outputs;

import com.pulumi.azurenative.storagecache.outputs.CacheUsernameDownloadSettingsResponseCredentials;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheUsernameDownloadSettingsResponse {
    /**
     * Determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     * 
     */
    private final @Nullable Boolean autoDownloadCertificate;
    /**
     * The URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     * 
     */
    private final @Nullable String caCertificateURI;
    /**
     * When present, these are the credentials for the secure LDAP connection.
     * 
     */
    private final @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials;
    /**
     * Whether or not the LDAP connection should be encrypted.
     * 
     */
    private final @Nullable Boolean encryptLdapConnection;
    /**
     * Whether or not Extended Groups is enabled.
     * 
     */
    private final @Nullable Boolean extendedGroups;
    /**
     * The URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
     */
    private final @Nullable String groupFileURI;
    /**
     * The base distinguished name for the LDAP domain.
     * 
     */
    private final @Nullable String ldapBaseDN;
    /**
     * The fully qualified domain name or IP address of the LDAP server to use.
     * 
     */
    private final @Nullable String ldapServer;
    /**
     * Determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     * 
     */
    private final @Nullable Boolean requireValidCertificate;
    /**
     * The URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
     */
    private final @Nullable String userFileURI;
    /**
     * Indicates whether or not the HPC Cache has performed the username download successfully.
     * 
     */
    private final String usernameDownloaded;
    /**
     * This setting determines how the cache gets username and group names for clients.
     * 
     */
    private final @Nullable String usernameSource;

    @CustomType.Constructor
    private CacheUsernameDownloadSettingsResponse(
        @CustomType.Parameter("autoDownloadCertificate") @Nullable Boolean autoDownloadCertificate,
        @CustomType.Parameter("caCertificateURI") @Nullable String caCertificateURI,
        @CustomType.Parameter("credentials") @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials,
        @CustomType.Parameter("encryptLdapConnection") @Nullable Boolean encryptLdapConnection,
        @CustomType.Parameter("extendedGroups") @Nullable Boolean extendedGroups,
        @CustomType.Parameter("groupFileURI") @Nullable String groupFileURI,
        @CustomType.Parameter("ldapBaseDN") @Nullable String ldapBaseDN,
        @CustomType.Parameter("ldapServer") @Nullable String ldapServer,
        @CustomType.Parameter("requireValidCertificate") @Nullable Boolean requireValidCertificate,
        @CustomType.Parameter("userFileURI") @Nullable String userFileURI,
        @CustomType.Parameter("usernameDownloaded") String usernameDownloaded,
        @CustomType.Parameter("usernameSource") @Nullable String usernameSource) {
        this.autoDownloadCertificate = autoDownloadCertificate;
        this.caCertificateURI = caCertificateURI;
        this.credentials = credentials;
        this.encryptLdapConnection = encryptLdapConnection;
        this.extendedGroups = extendedGroups;
        this.groupFileURI = groupFileURI;
        this.ldapBaseDN = ldapBaseDN;
        this.ldapServer = ldapServer;
        this.requireValidCertificate = requireValidCertificate;
        this.userFileURI = userFileURI;
        this.usernameDownloaded = usernameDownloaded;
        this.usernameSource = usernameSource;
    }

    /**
     * Determines if the certificate should be automatically downloaded. This applies to 'caCertificateURI' only if 'requireValidCertificate' is true.
     * 
    */
    public Optional<Boolean> autoDownloadCertificate() {
        return Optional.ofNullable(this.autoDownloadCertificate);
    }
    /**
     * The URI of the CA certificate to validate the LDAP secure connection. This field must be populated when 'requireValidCertificate' is set to true.
     * 
    */
    public Optional<String> caCertificateURI() {
        return Optional.ofNullable(this.caCertificateURI);
    }
    /**
     * When present, these are the credentials for the secure LDAP connection.
     * 
    */
    public Optional<CacheUsernameDownloadSettingsResponseCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * Whether or not the LDAP connection should be encrypted.
     * 
    */
    public Optional<Boolean> encryptLdapConnection() {
        return Optional.ofNullable(this.encryptLdapConnection);
    }
    /**
     * Whether or not Extended Groups is enabled.
     * 
    */
    public Optional<Boolean> extendedGroups() {
        return Optional.ofNullable(this.extendedGroups);
    }
    /**
     * The URI of the file containing group information (in /etc/group file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
    */
    public Optional<String> groupFileURI() {
        return Optional.ofNullable(this.groupFileURI);
    }
    /**
     * The base distinguished name for the LDAP domain.
     * 
    */
    public Optional<String> ldapBaseDN() {
        return Optional.ofNullable(this.ldapBaseDN);
    }
    /**
     * The fully qualified domain name or IP address of the LDAP server to use.
     * 
    */
    public Optional<String> ldapServer() {
        return Optional.ofNullable(this.ldapServer);
    }
    /**
     * Determines if the certificates must be validated by a certificate authority. When true, caCertificateURI must be provided.
     * 
    */
    public Optional<Boolean> requireValidCertificate() {
        return Optional.ofNullable(this.requireValidCertificate);
    }
    /**
     * The URI of the file containing user information (in /etc/passwd file format). This field must be populated when 'usernameSource' is set to 'File'.
     * 
    */
    public Optional<String> userFileURI() {
        return Optional.ofNullable(this.userFileURI);
    }
    /**
     * Indicates whether or not the HPC Cache has performed the username download successfully.
     * 
    */
    public String usernameDownloaded() {
        return this.usernameDownloaded;
    }
    /**
     * This setting determines how the cache gets username and group names for clients.
     * 
    */
    public Optional<String> usernameSource() {
        return Optional.ofNullable(this.usernameSource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheUsernameDownloadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDownloadCertificate;
        private @Nullable String caCertificateURI;
        private @Nullable CacheUsernameDownloadSettingsResponseCredentials credentials;
        private @Nullable Boolean encryptLdapConnection;
        private @Nullable Boolean extendedGroups;
        private @Nullable String groupFileURI;
        private @Nullable String ldapBaseDN;
        private @Nullable String ldapServer;
        private @Nullable Boolean requireValidCertificate;
        private @Nullable String userFileURI;
        private String usernameDownloaded;
        private @Nullable String usernameSource;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheUsernameDownloadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDownloadCertificate = defaults.autoDownloadCertificate;
    	      this.caCertificateURI = defaults.caCertificateURI;
    	      this.credentials = defaults.credentials;
    	      this.encryptLdapConnection = defaults.encryptLdapConnection;
    	      this.extendedGroups = defaults.extendedGroups;
    	      this.groupFileURI = defaults.groupFileURI;
    	      this.ldapBaseDN = defaults.ldapBaseDN;
    	      this.ldapServer = defaults.ldapServer;
    	      this.requireValidCertificate = defaults.requireValidCertificate;
    	      this.userFileURI = defaults.userFileURI;
    	      this.usernameDownloaded = defaults.usernameDownloaded;
    	      this.usernameSource = defaults.usernameSource;
        }

        public Builder autoDownloadCertificate(@Nullable Boolean autoDownloadCertificate) {
            this.autoDownloadCertificate = autoDownloadCertificate;
            return this;
        }
        public Builder caCertificateURI(@Nullable String caCertificateURI) {
            this.caCertificateURI = caCertificateURI;
            return this;
        }
        public Builder credentials(@Nullable CacheUsernameDownloadSettingsResponseCredentials credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder encryptLdapConnection(@Nullable Boolean encryptLdapConnection) {
            this.encryptLdapConnection = encryptLdapConnection;
            return this;
        }
        public Builder extendedGroups(@Nullable Boolean extendedGroups) {
            this.extendedGroups = extendedGroups;
            return this;
        }
        public Builder groupFileURI(@Nullable String groupFileURI) {
            this.groupFileURI = groupFileURI;
            return this;
        }
        public Builder ldapBaseDN(@Nullable String ldapBaseDN) {
            this.ldapBaseDN = ldapBaseDN;
            return this;
        }
        public Builder ldapServer(@Nullable String ldapServer) {
            this.ldapServer = ldapServer;
            return this;
        }
        public Builder requireValidCertificate(@Nullable Boolean requireValidCertificate) {
            this.requireValidCertificate = requireValidCertificate;
            return this;
        }
        public Builder userFileURI(@Nullable String userFileURI) {
            this.userFileURI = userFileURI;
            return this;
        }
        public Builder usernameDownloaded(String usernameDownloaded) {
            this.usernameDownloaded = Objects.requireNonNull(usernameDownloaded);
            return this;
        }
        public Builder usernameSource(@Nullable String usernameSource) {
            this.usernameSource = usernameSource;
            return this;
        }        public CacheUsernameDownloadSettingsResponse build() {
            return new CacheUsernameDownloadSettingsResponse(autoDownloadCertificate, caCertificateURI, credentials, encryptLdapConnection, extendedGroups, groupFileURI, ldapBaseDN, ldapServer, requireValidCertificate, userFileURI, usernameDownloaded, usernameSource);
        }
    }
}
