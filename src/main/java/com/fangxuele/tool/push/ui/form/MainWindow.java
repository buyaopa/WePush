package com.fangxuele.tool.push.ui.form;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 * 主界面
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2017/6/7.
 */
@Getter
public class MainWindow {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JPanel aboutPanel;
    private JSplitPane messagePanel;
    private JPanel memberPanel;
    private JPanel pushPanel;
    private JPanel helpPanel;
    private JPanel settingPanel;
    private JProgressBar pushTotalProgressBar;
    private JTextField maxThreadPoolTextField;
    private JTextField threadCountTextField;
    private JTextArea pushConsoleTextArea;
    private JTable pushThreadTable;
    private JButton ScheduleRunButton;
    private JLabel pushSuccessCount;
    private JLabel pushFailCount;
    private JButton pushStopButton;
    private JButton pushStartButton;
    private JPanel pushUpPanel;
    private JPanel pushDownPanel;
    private JPanel pushCenterPanel;
    private JPanel pushControlPanel;
    private JLabel pushTotalCountLabel;
    private JLabel availableProcessorLabel;
    private JLabel jvmMemoryLabel;
    private JLabel pushTotalProgressLabel;
    private JPanel schedulePanel;
    private JCheckBox dryRunCheckBox;
    private JLabel pushLastTimeLabel;
    private JLabel pushLeftTimeLabel;
    private JLabel pushMsgName;
    private JLabel scheduleDetailLabel;
    private JPanel pushHisPanel;
    private JPanel userCasePanel;
    private JPanel messageEditPanel;
    private JPanel messageManagePanel;

    public static MainWindow mainWindow = new MainWindow();

    public void init() {
        mainWindow.getAboutPanel().add(AboutForm.aboutForm.getAboutPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getHelpPanel().add(HelpForm.helpForm.getHelpPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getUserCasePanel().add(UserCaseForm.userCaseForm.getUserCasePanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getSchedulePanel().add(ScheduleForm.scheduleForm.getSchedulePanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getPushHisPanel().add(PushHisForm.pushHisForm.getPushHisPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getSettingPanel().add(SettingForm.settingForm.getSettingPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getMessageEditPanel().add(MessageEditForm.messageEditForm.getMessageEditPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getMessageManagePanel().add(MessageManageForm.messageManageForm.getMessageManagePanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        mainWindow.getMemberPanel().add(MemberForm.memberForm.getMemberPanel(), new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(8, 0, 0, 0), -1, -1));
        tabbedPane = new JTabbedPane();
        tabbedPane.setDoubleBuffered(true);
        Font tabbedPaneFont = this.$$$getFont$$$(null, -1, -1, tabbedPane.getFont());
        if (tabbedPaneFont != null) tabbedPane.setFont(tabbedPaneFont);
        mainPanel.add(tabbedPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        aboutPanel = new JPanel();
        aboutPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("关于", aboutPanel);
        helpPanel = new JPanel();
        helpPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 10, 0), -1, -1));
        tabbedPane.addTab("使用帮助", helpPanel);
        messagePanel = new JSplitPane();
        messagePanel.setContinuousLayout(true);
        messagePanel.setDividerLocation(280);
        messagePanel.setDividerSize(4);
        messagePanel.setDoubleBuffered(true);
        tabbedPane.addTab("编辑消息", messagePanel);
        messageEditPanel = new JPanel();
        messageEditPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 8, 0, 8), -1, -1));
        messageEditPanel.setMaximumSize(new Dimension(-1, -1));
        messageEditPanel.setMinimumSize(new Dimension(-1, -1));
        messageEditPanel.setPreferredSize(new Dimension(-1, -1));
        messagePanel.setRightComponent(messageEditPanel);
        messageManagePanel = new JPanel();
        messageManagePanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        messageManagePanel.setMaximumSize(new Dimension(-1, -1));
        messageManagePanel.setMinimumSize(new Dimension(-1, -1));
        messageManagePanel.setPreferredSize(new Dimension(280, -1));
        messagePanel.setLeftComponent(messageManagePanel);
        memberPanel = new JPanel();
        memberPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("准备目标用户", memberPanel);
        pushPanel = new JPanel();
        pushPanel.setLayout(new GridLayoutManager(3, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("开始推送", pushPanel);
        pushUpPanel = new JPanel();
        pushUpPanel.setLayout(new GridLayoutManager(8, 13, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushUpPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushSuccessCount = new JLabel();
        Font pushSuccessCountFont = this.$$$getFont$$$("Microsoft JhengHei UI", -1, 48, pushSuccessCount.getFont());
        if (pushSuccessCountFont != null) pushSuccessCount.setFont(pushSuccessCountFont);
        pushSuccessCount.setForeground(new Color(-13587376));
        pushSuccessCount.setText("0");
        pushUpPanel.add(pushSuccessCount, new GridConstraints(0, 0, 7, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushFailCount = new JLabel();
        Font pushFailCountFont = this.$$$getFont$$$("Microsoft YaHei UI", -1, 48, pushFailCount.getFont());
        if (pushFailCountFont != null) pushFailCount.setFont(pushFailCountFont);
        pushFailCount.setForeground(new Color(-2200483));
        pushFailCount.setText("0");
        pushUpPanel.add(pushFailCount, new GridConstraints(0, 2, 7, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalProgressLabel = new JLabel();
        pushTotalProgressLabel.setText("总进度");
        pushUpPanel.add(pushTotalProgressLabel, new GridConstraints(6, 8, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalProgressBar = new JProgressBar();
        pushTotalProgressBar.setStringPainted(true);
        pushUpPanel.add(pushTotalProgressBar, new GridConstraints(6, 9, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("成功");
        pushUpPanel.add(label1, new GridConstraints(3, 1, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("失败");
        pushUpPanel.add(label2, new GridConstraints(3, 3, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator1 = new JSeparator();
        separator1.setOrientation(1);
        pushUpPanel.add(separator1, new GridConstraints(0, 4, 7, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushLastTimeLabel = new JLabel();
        pushLastTimeLabel.setEnabled(true);
        Font pushLastTimeLabelFont = this.$$$getFont$$$(null, -1, 36, pushLastTimeLabel.getFont());
        if (pushLastTimeLabelFont != null) pushLastTimeLabel.setFont(pushLastTimeLabelFont);
        pushLastTimeLabel.setForeground(new Color(-6710887));
        pushLastTimeLabel.setText("0s");
        pushUpPanel.add(pushLastTimeLabel, new GridConstraints(0, 6, 4, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("耗时");
        pushUpPanel.add(label3, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushLeftTimeLabel = new JLabel();
        Font pushLeftTimeLabelFont = this.$$$getFont$$$(null, -1, 36, pushLeftTimeLabel.getFont());
        if (pushLeftTimeLabelFont != null) pushLeftTimeLabel.setFont(pushLeftTimeLabelFont);
        pushLeftTimeLabel.setForeground(new Color(-6710887));
        pushLeftTimeLabel.setText("0s");
        pushUpPanel.add(pushLeftTimeLabel, new GridConstraints(4, 6, 3, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator2 = new JSeparator();
        separator2.setOrientation(1);
        pushUpPanel.add(separator2, new GridConstraints(0, 7, 7, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        jvmMemoryLabel = new JLabel();
        jvmMemoryLabel.setText("JVM内存占用：--");
        pushUpPanel.add(jvmMemoryLabel, new GridConstraints(4, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        availableProcessorLabel = new JLabel();
        availableProcessorLabel.setText("可用处理器核心：--");
        pushUpPanel.add(availableProcessorLabel, new GridConstraints(3, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalCountLabel = new JLabel();
        pushTotalCountLabel.setText("消息总数：0");
        pushUpPanel.add(pushTotalCountLabel, new GridConstraints(1, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushMsgName = new JLabel();
        Font pushMsgNameFont = this.$$$getFont$$$(null, -1, 24, pushMsgName.getFont());
        if (pushMsgNameFont != null) pushMsgName.setFont(pushMsgNameFont);
        pushMsgName.setForeground(new Color(-13587376));
        pushMsgName.setText("消息标题");
        pushUpPanel.add(pushMsgName, new GridConstraints(0, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("预计剩余");
        pushUpPanel.add(label4, new GridConstraints(5, 5, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scheduleDetailLabel = new JLabel();
        scheduleDetailLabel.setForeground(new Color(-276358));
        scheduleDetailLabel.setText("");
        pushUpPanel.add(scheduleDetailLabel, new GridConstraints(5, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("每个线程平均分配：0");
        pushUpPanel.add(label5, new GridConstraints(2, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushDownPanel = new JPanel();
        pushDownPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushDownPanel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        pushControlPanel = new JPanel();
        pushControlPanel.setLayout(new GridLayoutManager(1, 9, new Insets(0, 0, 0, 0), -1, -1));
        pushDownPanel.add(pushControlPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("最大线程池");
        pushControlPanel.add(label6, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        maxThreadPoolTextField = new JTextField();
        pushControlPanel.add(maxThreadPoolTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, -1), null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("线程数");
        pushControlPanel.add(label7, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        threadCountTextField = new JTextField();
        pushControlPanel.add(threadCountTextField, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, -1), null, 0, false));
        ScheduleRunButton = new JButton();
        ScheduleRunButton.setIcon(new ImageIcon(getClass().getResource("/icon/clock.png")));
        ScheduleRunButton.setText("按计划执行");
        pushControlPanel.add(ScheduleRunButton, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushStopButton = new JButton();
        pushStopButton.setEnabled(false);
        pushStopButton.setIcon(new ImageIcon(getClass().getResource("/icon/suspend.png")));
        pushStopButton.setText("停止");
        pushControlPanel.add(pushStopButton, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushStartButton = new JButton();
        pushStartButton.setIcon(new ImageIcon(getClass().getResource("/icon/run@2x.png")));
        pushStartButton.setText("开始");
        pushControlPanel.add(pushStartButton, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dryRunCheckBox = new JCheckBox();
        dryRunCheckBox.setText("空跑");
        pushControlPanel.add(dryRunCheckBox, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        pushControlPanel.add(spacer1, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        pushCenterPanel = new JPanel();
        pushCenterPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushCenterPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        pushCenterPanel.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushConsoleTextArea = new JTextArea();
        scrollPane1.setViewportView(pushConsoleTextArea);
        final JScrollPane scrollPane2 = new JScrollPane();
        pushCenterPanel.add(scrollPane2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushThreadTable = new JTable();
        pushThreadTable.setGridColor(new Color(-12236470));
        pushThreadTable.setRowHeight(40);
        scrollPane2.setViewportView(pushThreadTable);
        schedulePanel = new JPanel();
        schedulePanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("计划任务", schedulePanel);
        pushHisPanel = new JPanel();
        pushHisPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("推送历史管理", pushHisPanel);
        settingPanel = new JPanel();
        settingPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        Font settingPanelFont = this.$$$getFont$$$("Microsoft YaHei UI", -1, -1, settingPanel.getFont());
        if (settingPanelFont != null) settingPanel.setFont(settingPanelFont);
        tabbedPane.addTab("设置", settingPanel);
        userCasePanel = new JPanel();
        userCasePanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 10, 0), -1, -1));
        tabbedPane.addTab("他们都在用", userCasePanel);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
